// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetSpeechVoiceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Data")
    public GetSpeechVoiceResponseBodyData data;

    public static GetSpeechVoiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSpeechVoiceResponseBody self = new GetSpeechVoiceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSpeechVoiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSpeechVoiceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetSpeechVoiceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSpeechVoiceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetSpeechVoiceResponseBody setData(GetSpeechVoiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSpeechVoiceResponseBodyData getData() {
        return this.data;
    }

    public static class GetSpeechVoiceResponseBodyDataItemsVoiceListItems extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("Label")
        public String label;

        public static GetSpeechVoiceResponseBodyDataItemsVoiceListItems build(java.util.Map<String, ?> map) throws Exception {
            GetSpeechVoiceResponseBodyDataItemsVoiceListItems self = new GetSpeechVoiceResponseBodyDataItemsVoiceListItems();
            return TeaModel.build(map, self);
        }

        public GetSpeechVoiceResponseBodyDataItemsVoiceListItems setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public GetSpeechVoiceResponseBodyDataItemsVoiceListItems setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class GetSpeechVoiceResponseBodyDataItemsVoiceList extends TeaModel {
        @NameInMap("Items")
        public java.util.List<GetSpeechVoiceResponseBodyDataItemsVoiceListItems> items;

        public static GetSpeechVoiceResponseBodyDataItemsVoiceList build(java.util.Map<String, ?> map) throws Exception {
            GetSpeechVoiceResponseBodyDataItemsVoiceList self = new GetSpeechVoiceResponseBodyDataItemsVoiceList();
            return TeaModel.build(map, self);
        }

        public GetSpeechVoiceResponseBodyDataItemsVoiceList setItems(java.util.List<GetSpeechVoiceResponseBodyDataItemsVoiceListItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<GetSpeechVoiceResponseBodyDataItemsVoiceListItems> getItems() {
            return this.items;
        }

    }

    public static class GetSpeechVoiceResponseBodyDataItems extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("Label")
        public String label;

        @NameInMap("VoiceList")
        public GetSpeechVoiceResponseBodyDataItemsVoiceList voiceList;

        public static GetSpeechVoiceResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            GetSpeechVoiceResponseBodyDataItems self = new GetSpeechVoiceResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public GetSpeechVoiceResponseBodyDataItems setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public GetSpeechVoiceResponseBodyDataItems setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetSpeechVoiceResponseBodyDataItems setVoiceList(GetSpeechVoiceResponseBodyDataItemsVoiceList voiceList) {
            this.voiceList = voiceList;
            return this;
        }
        public GetSpeechVoiceResponseBodyDataItemsVoiceList getVoiceList() {
            return this.voiceList;
        }

    }

    public static class GetSpeechVoiceResponseBodyData extends TeaModel {
        @NameInMap("Items")
        public java.util.List<GetSpeechVoiceResponseBodyDataItems> items;

        public static GetSpeechVoiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSpeechVoiceResponseBodyData self = new GetSpeechVoiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSpeechVoiceResponseBodyData setItems(java.util.List<GetSpeechVoiceResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<GetSpeechVoiceResponseBodyDataItems> getItems() {
            return this.items;
        }

    }

}
