// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class DeleteSmsTemplateNewResponseBody extends TeaModel {
    @NameInMap("FailList")
    public DeleteSmsTemplateNewResponseBodyFailList failList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SuccessList")
    public DeleteSmsTemplateNewResponseBodySuccessList successList;

    public static DeleteSmsTemplateNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSmsTemplateNewResponseBody self = new DeleteSmsTemplateNewResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSmsTemplateNewResponseBody setFailList(DeleteSmsTemplateNewResponseBodyFailList failList) {
        this.failList = failList;
        return this;
    }
    public DeleteSmsTemplateNewResponseBodyFailList getFailList() {
        return this.failList;
    }

    public DeleteSmsTemplateNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteSmsTemplateNewResponseBody setSuccessList(DeleteSmsTemplateNewResponseBodySuccessList successList) {
        this.successList = successList;
        return this;
    }
    public DeleteSmsTemplateNewResponseBodySuccessList getSuccessList() {
        return this.successList;
    }

    public static class DeleteSmsTemplateNewResponseBodyFailList extends TeaModel {
        @NameInMap("Fail")
        public java.util.List<String> fail;

        public static DeleteSmsTemplateNewResponseBodyFailList build(java.util.Map<String, ?> map) throws Exception {
            DeleteSmsTemplateNewResponseBodyFailList self = new DeleteSmsTemplateNewResponseBodyFailList();
            return TeaModel.build(map, self);
        }

        public DeleteSmsTemplateNewResponseBodyFailList setFail(java.util.List<String> fail) {
            this.fail = fail;
            return this;
        }
        public java.util.List<String> getFail() {
            return this.fail;
        }

    }

    public static class DeleteSmsTemplateNewResponseBodySuccessList extends TeaModel {
        @NameInMap("Succes")
        public java.util.List<String> succes;

        public static DeleteSmsTemplateNewResponseBodySuccessList build(java.util.Map<String, ?> map) throws Exception {
            DeleteSmsTemplateNewResponseBodySuccessList self = new DeleteSmsTemplateNewResponseBodySuccessList();
            return TeaModel.build(map, self);
        }

        public DeleteSmsTemplateNewResponseBodySuccessList setSucces(java.util.List<String> succes) {
            this.succes = succes;
            return this;
        }
        public java.util.List<String> getSucces() {
            return this.succes;
        }

    }

}
