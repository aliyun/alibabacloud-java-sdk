// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.contactcenterai20240603.models;

import com.aliyun.tea.*;

public class GetVocabResponseBody extends TeaModel {
    @NameInMap("data")
    public GetVocabResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>968A8634-FA2C-5381-9B3E-*******F</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public String success;

    public static GetVocabResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVocabResponseBody self = new GetVocabResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVocabResponseBody setData(GetVocabResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetVocabResponseBodyData getData() {
        return this.data;
    }

    public GetVocabResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVocabResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetVocabResponseBodyDataWordWeightList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("weight")
        public Integer weight;

        @NameInMap("word")
        public String word;

        public static GetVocabResponseBodyDataWordWeightList build(java.util.Map<String, ?> map) throws Exception {
            GetVocabResponseBodyDataWordWeightList self = new GetVocabResponseBodyDataWordWeightList();
            return TeaModel.build(map, self);
        }

        public GetVocabResponseBodyDataWordWeightList setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

        public GetVocabResponseBodyDataWordWeightList setWord(String word) {
            this.word = word;
            return this;
        }
        public String getWord() {
            return this.word;
        }

    }

    public static class GetVocabResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>nls</p>
         */
        @NameInMap("audioModelCode")
        public String audioModelCode;

        @NameInMap("description")
        public String description;

        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>rrbe***jrvrdd</p>
         */
        @NameInMap("vocabularyId")
        public String vocabularyId;

        @NameInMap("wordWeightList")
        public java.util.List<GetVocabResponseBodyDataWordWeightList> wordWeightList;

        public static GetVocabResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetVocabResponseBodyData self = new GetVocabResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetVocabResponseBodyData setAudioModelCode(String audioModelCode) {
            this.audioModelCode = audioModelCode;
            return this;
        }
        public String getAudioModelCode() {
            return this.audioModelCode;
        }

        public GetVocabResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetVocabResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetVocabResponseBodyData setVocabularyId(String vocabularyId) {
            this.vocabularyId = vocabularyId;
            return this;
        }
        public String getVocabularyId() {
            return this.vocabularyId;
        }

        public GetVocabResponseBodyData setWordWeightList(java.util.List<GetVocabResponseBodyDataWordWeightList> wordWeightList) {
            this.wordWeightList = wordWeightList;
            return this;
        }
        public java.util.List<GetVocabResponseBodyDataWordWeightList> getWordWeightList() {
            return this.wordWeightList;
        }

    }

}
