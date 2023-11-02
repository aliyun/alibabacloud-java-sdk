// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ShowQuickAnalysisResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public ShowQuickAnalysisResponseBodyData data;

    @NameInMap("DyCode")
    public String dyCode;

    @NameInMap("DyMessage")
    public String dyMessage;

    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ShowQuickAnalysisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ShowQuickAnalysisResponseBody self = new ShowQuickAnalysisResponseBody();
        return TeaModel.build(map, self);
    }

    public ShowQuickAnalysisResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ShowQuickAnalysisResponseBody setData(ShowQuickAnalysisResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ShowQuickAnalysisResponseBodyData getData() {
        return this.data;
    }

    public ShowQuickAnalysisResponseBody setDyCode(String dyCode) {
        this.dyCode = dyCode;
        return this;
    }
    public String getDyCode() {
        return this.dyCode;
    }

    public ShowQuickAnalysisResponseBody setDyMessage(String dyMessage) {
        this.dyMessage = dyMessage;
        return this;
    }
    public String getDyMessage() {
        return this.dyMessage;
    }

    public ShowQuickAnalysisResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ShowQuickAnalysisResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ShowQuickAnalysisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ShowQuickAnalysisResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ShowQuickAnalysisResponseBodyData extends TeaModel {
        @NameInMap("IndexList")
        public java.util.List<String> indexList;

        public static ShowQuickAnalysisResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ShowQuickAnalysisResponseBodyData self = new ShowQuickAnalysisResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ShowQuickAnalysisResponseBodyData setIndexList(java.util.List<String> indexList) {
            this.indexList = indexList;
            return this;
        }
        public java.util.List<String> getIndexList() {
            return this.indexList;
        }

    }

}
