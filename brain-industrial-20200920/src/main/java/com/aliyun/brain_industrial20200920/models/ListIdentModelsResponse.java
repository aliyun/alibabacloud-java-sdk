// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class ListIdentModelsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("PidIdentModelList")
    @Validation(required = true)
    public java.util.List<ListIdentModelsResponsePidIdentModelList> pidIdentModelList;

    public static ListIdentModelsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIdentModelsResponse self = new ListIdentModelsResponse();
        return TeaModel.build(map, self);
    }

    public ListIdentModelsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIdentModelsResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListIdentModelsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListIdentModelsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListIdentModelsResponse setPidIdentModelList(java.util.List<ListIdentModelsResponsePidIdentModelList> pidIdentModelList) {
        this.pidIdentModelList = pidIdentModelList;
        return this;
    }
    public java.util.List<ListIdentModelsResponsePidIdentModelList> getPidIdentModelList() {
        return this.pidIdentModelList;
    }

    public static class ListIdentModelsResponsePidIdentModelListModel extends TeaModel {
        @NameInMap("K")
        @Validation(required = true)
        public Float k;

        @NameInMap("Tau")
        @Validation(required = true)
        public Float tau;

        @NameInMap("T1")
        @Validation(required = true)
        public Float t1;

        @NameInMap("T2")
        @Validation(required = true)
        public Float t2;

        public static ListIdentModelsResponsePidIdentModelListModel build(java.util.Map<String, ?> map) throws Exception {
            ListIdentModelsResponsePidIdentModelListModel self = new ListIdentModelsResponsePidIdentModelListModel();
            return TeaModel.build(map, self);
        }

        public ListIdentModelsResponsePidIdentModelListModel setK(Float k) {
            this.k = k;
            return this;
        }
        public Float getK() {
            return this.k;
        }

        public ListIdentModelsResponsePidIdentModelListModel setTau(Float tau) {
            this.tau = tau;
            return this;
        }
        public Float getTau() {
            return this.tau;
        }

        public ListIdentModelsResponsePidIdentModelListModel setT1(Float t1) {
            this.t1 = t1;
            return this;
        }
        public Float getT1() {
            return this.t1;
        }

        public ListIdentModelsResponsePidIdentModelListModel setT2(Float t2) {
            this.t2 = t2;
            return this;
        }
        public Float getT2() {
            return this.t2;
        }

    }

    public static class ListIdentModelsResponsePidIdentModelList extends TeaModel {
        @NameInMap("ModelId")
        @Validation(required = true)
        public Integer modelId;

        @NameInMap("Desc")
        @Validation(required = true)
        public String desc;

        @NameInMap("Model")
        @Validation(required = true)
        public ListIdentModelsResponsePidIdentModelListModel model;

        public static ListIdentModelsResponsePidIdentModelList build(java.util.Map<String, ?> map) throws Exception {
            ListIdentModelsResponsePidIdentModelList self = new ListIdentModelsResponsePidIdentModelList();
            return TeaModel.build(map, self);
        }

        public ListIdentModelsResponsePidIdentModelList setModelId(Integer modelId) {
            this.modelId = modelId;
            return this;
        }
        public Integer getModelId() {
            return this.modelId;
        }

        public ListIdentModelsResponsePidIdentModelList setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public ListIdentModelsResponsePidIdentModelList setModel(ListIdentModelsResponsePidIdentModelListModel model) {
            this.model = model;
            return this;
        }
        public ListIdentModelsResponsePidIdentModelListModel getModel() {
            return this.model;
        }

    }

}
