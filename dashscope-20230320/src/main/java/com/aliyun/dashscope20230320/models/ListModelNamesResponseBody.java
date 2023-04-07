// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dashscope20230320.models;

import com.aliyun.tea.*;

public class ListModelNamesResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Data")
    public java.util.List<ListModelNamesResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListModelNamesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListModelNamesResponseBody self = new ListModelNamesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListModelNamesResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListModelNamesResponseBody setData(java.util.List<ListModelNamesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListModelNamesResponseBodyData> getData() {
        return this.data;
    }

    public ListModelNamesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListModelNamesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListModelNamesResponseBodyData extends TeaModel {
        @NameInMap("ModelDesc")
        public String modelDesc;

        @NameInMap("ModelName")
        public String modelName;

        @NameInMap("ModelUnit")
        public String modelUnit;

        public static ListModelNamesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListModelNamesResponseBodyData self = new ListModelNamesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListModelNamesResponseBodyData setModelDesc(String modelDesc) {
            this.modelDesc = modelDesc;
            return this;
        }
        public String getModelDesc() {
            return this.modelDesc;
        }

        public ListModelNamesResponseBodyData setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public ListModelNamesResponseBodyData setModelUnit(String modelUnit) {
            this.modelUnit = modelUnit;
            return this;
        }
        public String getModelUnit() {
            return this.modelUnit;
        }

    }

}
