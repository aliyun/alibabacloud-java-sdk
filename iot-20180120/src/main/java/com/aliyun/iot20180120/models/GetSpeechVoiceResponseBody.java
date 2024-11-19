// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetSpeechVoiceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>iot.speechsolution.NotSigned</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetSpeechVoiceResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>speech solution has not been signed</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>F94F72A5-82F0-496F-9AC2-3DBCFF77608A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetSpeechVoiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSpeechVoiceResponseBody self = new GetSpeechVoiceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSpeechVoiceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSpeechVoiceResponseBody setData(GetSpeechVoiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSpeechVoiceResponseBodyData getData() {
        return this.data;
    }

    public GetSpeechVoiceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
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

    public static class GetSpeechVoiceResponseBodyDataItemsVoiceListItems extends TeaModel {
        @NameInMap("Label")
        public String label;

        /**
         * <strong>example:</strong>
         * <p>Xiaoyun</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetSpeechVoiceResponseBodyDataItemsVoiceListItems build(java.util.Map<String, ?> map) throws Exception {
            GetSpeechVoiceResponseBodyDataItemsVoiceListItems self = new GetSpeechVoiceResponseBodyDataItemsVoiceListItems();
            return TeaModel.build(map, self);
        }

        public GetSpeechVoiceResponseBodyDataItemsVoiceListItems setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetSpeechVoiceResponseBodyDataItemsVoiceListItems setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
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
        @NameInMap("Label")
        public String label;

        /**
         * <strong>example:</strong>
         * <p>tongyong</p>
         */
        @NameInMap("Value")
        public String value;

        @NameInMap("VoiceList")
        public GetSpeechVoiceResponseBodyDataItemsVoiceList voiceList;

        public static GetSpeechVoiceResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            GetSpeechVoiceResponseBodyDataItems self = new GetSpeechVoiceResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public GetSpeechVoiceResponseBodyDataItems setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetSpeechVoiceResponseBodyDataItems setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
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
