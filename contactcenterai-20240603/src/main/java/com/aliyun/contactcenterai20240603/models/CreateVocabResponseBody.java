// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.contactcenterai20240603.models;

import com.aliyun.tea.*;

public class CreateVocabResponseBody extends TeaModel {
    @NameInMap("data")
    public CreateVocabResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>968A8634-FA2C-5381-9B3E-*******F</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public String success;

    public static CreateVocabResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVocabResponseBody self = new CreateVocabResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVocabResponseBody setData(CreateVocabResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateVocabResponseBodyData getData() {
        return this.data;
    }

    public CreateVocabResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVocabResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class CreateVocabResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>f3d82*******7</p>
         */
        @NameInMap("vocabularyId")
        public String vocabularyId;

        public static CreateVocabResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateVocabResponseBodyData self = new CreateVocabResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateVocabResponseBodyData setVocabularyId(String vocabularyId) {
            this.vocabularyId = vocabularyId;
            return this;
        }
        public String getVocabularyId() {
            return this.vocabularyId;
        }

    }

}
