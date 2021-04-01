// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeBatchSlsDispatchStatusResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("SlsConfigStatusList")
    @Validation(required = true)
    public java.util.List<DescribeBatchSlsDispatchStatusResponseSlsConfigStatusList> slsConfigStatusList;

    public static DescribeBatchSlsDispatchStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBatchSlsDispatchStatusResponse self = new DescribeBatchSlsDispatchStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBatchSlsDispatchStatusResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBatchSlsDispatchStatusResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeBatchSlsDispatchStatusResponse setSlsConfigStatusList(java.util.List<DescribeBatchSlsDispatchStatusResponseSlsConfigStatusList> slsConfigStatusList) {
        this.slsConfigStatusList = slsConfigStatusList;
        return this;
    }
    public java.util.List<DescribeBatchSlsDispatchStatusResponseSlsConfigStatusList> getSlsConfigStatusList() {
        return this.slsConfigStatusList;
    }

    public static class DescribeBatchSlsDispatchStatusResponseSlsConfigStatusList extends TeaModel {
        @NameInMap("Enable")
        @Validation(required = true)
        public Boolean enable;

        @NameInMap("Domain")
        @Validation(required = true)
        public String domain;

        public static DescribeBatchSlsDispatchStatusResponseSlsConfigStatusList build(java.util.Map<String, ?> map) throws Exception {
            DescribeBatchSlsDispatchStatusResponseSlsConfigStatusList self = new DescribeBatchSlsDispatchStatusResponseSlsConfigStatusList();
            return TeaModel.build(map, self);
        }

        public DescribeBatchSlsDispatchStatusResponseSlsConfigStatusList setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public DescribeBatchSlsDispatchStatusResponseSlsConfigStatusList setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

    }

}
