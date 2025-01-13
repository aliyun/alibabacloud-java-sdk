// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class AddCustomQAV2ResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>FAFCD152-4791-5F2F-B0BE-2DC06FD4F05B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public AddCustomQAV2ResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("StatusCode")
    public Integer statusCode;

    public static AddCustomQAV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddCustomQAV2ResponseBody self = new AddCustomQAV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public AddCustomQAV2ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddCustomQAV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddCustomQAV2ResponseBody setResult(AddCustomQAV2ResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public AddCustomQAV2ResponseBodyResult getResult() {
        return this.result;
    }

    public AddCustomQAV2ResponseBody setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public static class AddCustomQAV2ResponseBodyResult extends TeaModel {
        @NameInMap("Answers")
        public String answers;

        /**
         * <strong>example:</strong>
         * <p>2023-01-10 10:01:59</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>a7***83</p>
         */
        @NameInMap("HotelId")
        public String hotelId;

        @NameInMap("KeyWords")
        public String keyWords;

        /**
         * <strong>example:</strong>
         * <p>8xxx9</p>
         */
        @NameInMap("LastOperator")
        public String lastOperator;

        @NameInMap("MajorQuestion")
        public String majorQuestion;

        /**
         * <p>qaID</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("QaId")
        public String qaId;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status")
        public Integer status;

        @NameInMap("SupplementaryQuestion")
        public String supplementaryQuestion;

        /**
         * <strong>example:</strong>
         * <p>2023-01-10 10:01:59</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static AddCustomQAV2ResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            AddCustomQAV2ResponseBodyResult self = new AddCustomQAV2ResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public AddCustomQAV2ResponseBodyResult setAnswers(String answers) {
            this.answers = answers;
            return this;
        }
        public String getAnswers() {
            return this.answers;
        }

        public AddCustomQAV2ResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public AddCustomQAV2ResponseBodyResult setHotelId(String hotelId) {
            this.hotelId = hotelId;
            return this;
        }
        public String getHotelId() {
            return this.hotelId;
        }

        public AddCustomQAV2ResponseBodyResult setKeyWords(String keyWords) {
            this.keyWords = keyWords;
            return this;
        }
        public String getKeyWords() {
            return this.keyWords;
        }

        public AddCustomQAV2ResponseBodyResult setLastOperator(String lastOperator) {
            this.lastOperator = lastOperator;
            return this;
        }
        public String getLastOperator() {
            return this.lastOperator;
        }

        public AddCustomQAV2ResponseBodyResult setMajorQuestion(String majorQuestion) {
            this.majorQuestion = majorQuestion;
            return this;
        }
        public String getMajorQuestion() {
            return this.majorQuestion;
        }

        public AddCustomQAV2ResponseBodyResult setQaId(String qaId) {
            this.qaId = qaId;
            return this;
        }
        public String getQaId() {
            return this.qaId;
        }

        public AddCustomQAV2ResponseBodyResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public AddCustomQAV2ResponseBodyResult setSupplementaryQuestion(String supplementaryQuestion) {
            this.supplementaryQuestion = supplementaryQuestion;
            return this;
        }
        public String getSupplementaryQuestion() {
            return this.supplementaryQuestion;
        }

        public AddCustomQAV2ResponseBodyResult setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
