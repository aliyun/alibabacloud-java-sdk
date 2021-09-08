// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetSpeechVoiceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Data")
    @Validation(required = true)
    public GetSpeechVoiceResponseData data;

    public static GetSpeechVoiceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSpeechVoiceResponse self = new GetSpeechVoiceResponse();
        return TeaModel.build(map, self);
    }

    public GetSpeechVoiceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSpeechVoiceResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetSpeechVoiceResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSpeechVoiceResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetSpeechVoiceResponse setData(GetSpeechVoiceResponseData data) {
        this.data = data;
        return this;
    }
    public GetSpeechVoiceResponseData getData() {
        return this.data;
    }

    public static class GetSpeechVoiceResponseDataItemsVoiceListItems extends TeaModel {
        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        @NameInMap("Label")
        @Validation(required = true)
        public String label;

        public static GetSpeechVoiceResponseDataItemsVoiceListItems build(java.util.Map<String, ?> map) throws Exception {
            GetSpeechVoiceResponseDataItemsVoiceListItems self = new GetSpeechVoiceResponseDataItemsVoiceListItems();
            return TeaModel.build(map, self);
        }

        public GetSpeechVoiceResponseDataItemsVoiceListItems setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public GetSpeechVoiceResponseDataItemsVoiceListItems setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class GetSpeechVoiceResponseDataItemsVoiceList extends TeaModel {
        @NameInMap("Items")
        @Validation(required = true)
        public java.util.List<GetSpeechVoiceResponseDataItemsVoiceListItems> items;

        public static GetSpeechVoiceResponseDataItemsVoiceList build(java.util.Map<String, ?> map) throws Exception {
            GetSpeechVoiceResponseDataItemsVoiceList self = new GetSpeechVoiceResponseDataItemsVoiceList();
            return TeaModel.build(map, self);
        }

        public GetSpeechVoiceResponseDataItemsVoiceList setItems(java.util.List<GetSpeechVoiceResponseDataItemsVoiceListItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<GetSpeechVoiceResponseDataItemsVoiceListItems> getItems() {
            return this.items;
        }

    }

    public static class GetSpeechVoiceResponseDataItems extends TeaModel {
        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        @NameInMap("Label")
        @Validation(required = true)
        public String label;

        @NameInMap("VoiceList")
        @Validation(required = true)
        public GetSpeechVoiceResponseDataItemsVoiceList voiceList;

        public static GetSpeechVoiceResponseDataItems build(java.util.Map<String, ?> map) throws Exception {
            GetSpeechVoiceResponseDataItems self = new GetSpeechVoiceResponseDataItems();
            return TeaModel.build(map, self);
        }

        public GetSpeechVoiceResponseDataItems setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public GetSpeechVoiceResponseDataItems setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetSpeechVoiceResponseDataItems setVoiceList(GetSpeechVoiceResponseDataItemsVoiceList voiceList) {
            this.voiceList = voiceList;
            return this;
        }
        public GetSpeechVoiceResponseDataItemsVoiceList getVoiceList() {
            return this.voiceList;
        }

    }

    public static class GetSpeechVoiceResponseData extends TeaModel {
        @NameInMap("Items")
        @Validation(required = true)
        public java.util.List<GetSpeechVoiceResponseDataItems> items;

        public static GetSpeechVoiceResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetSpeechVoiceResponseData self = new GetSpeechVoiceResponseData();
            return TeaModel.build(map, self);
        }

        public GetSpeechVoiceResponseData setItems(java.util.List<GetSpeechVoiceResponseDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<GetSpeechVoiceResponseDataItems> getItems() {
            return this.items;
        }

    }

}
