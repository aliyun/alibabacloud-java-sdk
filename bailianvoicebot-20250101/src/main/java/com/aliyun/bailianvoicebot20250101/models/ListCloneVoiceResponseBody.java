// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianvoicebot20250101.models;

import com.aliyun.tea.*;

public class ListCloneVoiceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListCloneVoiceResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>Instance llm-xdne77rxe14ziszr
     *  does not exist.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>D771A1B6-3D5F-174A-BEE1-98CE1000D337</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListCloneVoiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCloneVoiceResponseBody self = new ListCloneVoiceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCloneVoiceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCloneVoiceResponseBody setData(ListCloneVoiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListCloneVoiceResponseBodyData getData() {
        return this.data;
    }

    public ListCloneVoiceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListCloneVoiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCloneVoiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListCloneVoiceResponseBodyDataCloneVoices extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>8ee1160a-6999-478f-8df6-f33ef21f27d5</p>
         */
        @NameInMap("CloneVoiceId")
        public String cloneVoiceId;

        /**
         * <strong>example:</strong>
         * <p>1760494691000</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        /**
         * <strong>example:</strong>
         * <p>llm-xdne77rxe14ziszr</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>CosyVoice</p>
         */
        @NameInMap("Model")
        public String model;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>BAILIAN</p>
         */
        @NameInMap("NlsEngine")
        public String nlsEngine;

        /**
         * <strong>example:</strong>
         * <p>Published</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>1655449505171</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <strong>example:</strong>
         * <p>1760494691000</p>
         */
        @NameInMap("UpdatedTime")
        public Long updatedTime;

        /**
         * <strong>example:</strong>
         * <p>cosyvoice-v3-plus-voicebot2-3666e4bbb2b94832ac4f4107b5804c34</p>
         */
        @NameInMap("Voice")
        public String voice;

        public static ListCloneVoiceResponseBodyDataCloneVoices build(java.util.Map<String, ?> map) throws Exception {
            ListCloneVoiceResponseBodyDataCloneVoices self = new ListCloneVoiceResponseBodyDataCloneVoices();
            return TeaModel.build(map, self);
        }

        public ListCloneVoiceResponseBodyDataCloneVoices setCloneVoiceId(String cloneVoiceId) {
            this.cloneVoiceId = cloneVoiceId;
            return this;
        }
        public String getCloneVoiceId() {
            return this.cloneVoiceId;
        }

        public ListCloneVoiceResponseBodyDataCloneVoices setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public ListCloneVoiceResponseBodyDataCloneVoices setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListCloneVoiceResponseBodyDataCloneVoices setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public ListCloneVoiceResponseBodyDataCloneVoices setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListCloneVoiceResponseBodyDataCloneVoices setNlsEngine(String nlsEngine) {
            this.nlsEngine = nlsEngine;
            return this;
        }
        public String getNlsEngine() {
            return this.nlsEngine;
        }

        public ListCloneVoiceResponseBodyDataCloneVoices setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListCloneVoiceResponseBodyDataCloneVoices setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListCloneVoiceResponseBodyDataCloneVoices setUpdatedTime(Long updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

        public ListCloneVoiceResponseBodyDataCloneVoices setVoice(String voice) {
            this.voice = voice;
            return this;
        }
        public String getVoice() {
            return this.voice;
        }

    }

    public static class ListCloneVoiceResponseBodyData extends TeaModel {
        @NameInMap("CloneVoices")
        public java.util.List<ListCloneVoiceResponseBodyDataCloneVoices> cloneVoices;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListCloneVoiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCloneVoiceResponseBodyData self = new ListCloneVoiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCloneVoiceResponseBodyData setCloneVoices(java.util.List<ListCloneVoiceResponseBodyDataCloneVoices> cloneVoices) {
            this.cloneVoices = cloneVoices;
            return this;
        }
        public java.util.List<ListCloneVoiceResponseBodyDataCloneVoices> getCloneVoices() {
            return this.cloneVoices;
        }

        public ListCloneVoiceResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListCloneVoiceResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListCloneVoiceResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
