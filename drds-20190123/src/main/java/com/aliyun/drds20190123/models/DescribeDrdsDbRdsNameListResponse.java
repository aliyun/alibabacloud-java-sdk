// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsDbRdsNameListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("InstanceNameList")
    @Validation(required = true)
    public DescribeDrdsDbRdsNameListResponseInstanceNameList instanceNameList;

    public static DescribeDrdsDbRdsNameListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsDbRdsNameListResponse self = new DescribeDrdsDbRdsNameListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsDbRdsNameListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDrdsDbRdsNameListResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeDrdsDbRdsNameListResponse setInstanceNameList(DescribeDrdsDbRdsNameListResponseInstanceNameList instanceNameList) {
        this.instanceNameList = instanceNameList;
        return this;
    }
    public DescribeDrdsDbRdsNameListResponseInstanceNameList getInstanceNameList() {
        return this.instanceNameList;
    }

    public static class DescribeDrdsDbRdsNameListResponseInstanceNameList extends TeaModel {
        @NameInMap("InstanceName")
        @Validation(required = true)
        public java.util.List<String> instanceName;

        public static DescribeDrdsDbRdsNameListResponseInstanceNameList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsDbRdsNameListResponseInstanceNameList self = new DescribeDrdsDbRdsNameListResponseInstanceNameList();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsDbRdsNameListResponseInstanceNameList setInstanceName(java.util.List<String> instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public java.util.List<String> getInstanceName() {
            return this.instanceName;
        }

    }

}
