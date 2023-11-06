// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsDbRdsNameListResponseBody extends TeaModel {
    /**
     * <p>Indicates the instances that are used to store the data of a database.</p>
     */
    @NameInMap("InstanceNameList")
    public DescribeDrdsDbRdsNameListResponseBodyInstanceNameList instanceNameList;

    /**
     * <p>Indicates the ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeDrdsDbRdsNameListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsDbRdsNameListResponseBody self = new DescribeDrdsDbRdsNameListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsDbRdsNameListResponseBody setInstanceNameList(DescribeDrdsDbRdsNameListResponseBodyInstanceNameList instanceNameList) {
        this.instanceNameList = instanceNameList;
        return this;
    }
    public DescribeDrdsDbRdsNameListResponseBodyInstanceNameList getInstanceNameList() {
        return this.instanceNameList;
    }

    public DescribeDrdsDbRdsNameListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDrdsDbRdsNameListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeDrdsDbRdsNameListResponseBodyInstanceNameList extends TeaModel {
        @NameInMap("InstanceName")
        public java.util.List<String> instanceName;

        public static DescribeDrdsDbRdsNameListResponseBodyInstanceNameList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsDbRdsNameListResponseBodyInstanceNameList self = new DescribeDrdsDbRdsNameListResponseBodyInstanceNameList();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsDbRdsNameListResponseBodyInstanceNameList setInstanceName(java.util.List<String> instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public java.util.List<String> getInstanceName() {
            return this.instanceName;
        }

    }

}
