// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeBatchSlsDispatchStatusResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>CF33B4C3-196E-4015-AADD-5CAD00057B80</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SlsConfigStatusList")
    public java.util.List<DescribeBatchSlsDispatchStatusResponseBodySlsConfigStatusList> slsConfigStatusList;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeBatchSlsDispatchStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBatchSlsDispatchStatusResponseBody self = new DescribeBatchSlsDispatchStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBatchSlsDispatchStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBatchSlsDispatchStatusResponseBody setSlsConfigStatusList(java.util.List<DescribeBatchSlsDispatchStatusResponseBodySlsConfigStatusList> slsConfigStatusList) {
        this.slsConfigStatusList = slsConfigStatusList;
        return this;
    }
    public java.util.List<DescribeBatchSlsDispatchStatusResponseBodySlsConfigStatusList> getSlsConfigStatusList() {
        return this.slsConfigStatusList;
    }

    public DescribeBatchSlsDispatchStatusResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeBatchSlsDispatchStatusResponseBodySlsConfigStatusList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        public static DescribeBatchSlsDispatchStatusResponseBodySlsConfigStatusList build(java.util.Map<String, ?> map) throws Exception {
            DescribeBatchSlsDispatchStatusResponseBodySlsConfigStatusList self = new DescribeBatchSlsDispatchStatusResponseBodySlsConfigStatusList();
            return TeaModel.build(map, self);
        }

        public DescribeBatchSlsDispatchStatusResponseBodySlsConfigStatusList setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeBatchSlsDispatchStatusResponseBodySlsConfigStatusList setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

    }

}
