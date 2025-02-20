// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.contactcenterai20240603.models;

import com.aliyun.tea.*;

public class ListVocabResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<ListVocabResponseBodyData> data;

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

    public static ListVocabResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVocabResponseBody self = new ListVocabResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVocabResponseBody setData(java.util.List<ListVocabResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListVocabResponseBodyData> getData() {
        return this.data;
    }

    public ListVocabResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVocabResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class ListVocabResponseBodyDataWordWeightList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("weight")
        public Integer weight;

        @NameInMap("word")
        public String word;

        public static ListVocabResponseBodyDataWordWeightList build(java.util.Map<String, ?> map) throws Exception {
            ListVocabResponseBodyDataWordWeightList self = new ListVocabResponseBodyDataWordWeightList();
            return TeaModel.build(map, self);
        }

        public ListVocabResponseBodyDataWordWeightList setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

        public ListVocabResponseBodyDataWordWeightList setWord(String word) {
            this.word = word;
            return this;
        }
        public String getWord() {
            return this.word;
        }

    }

    public static class ListVocabResponseBodyData extends TeaModel {
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
         * <p>dv*****erverve</p>
         */
        @NameInMap("vocabularyId")
        public String vocabularyId;

        @NameInMap("wordWeightList")
        public java.util.List<ListVocabResponseBodyDataWordWeightList> wordWeightList;

        public static ListVocabResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListVocabResponseBodyData self = new ListVocabResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListVocabResponseBodyData setAudioModelCode(String audioModelCode) {
            this.audioModelCode = audioModelCode;
            return this;
        }
        public String getAudioModelCode() {
            return this.audioModelCode;
        }

        public ListVocabResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListVocabResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListVocabResponseBodyData setVocabularyId(String vocabularyId) {
            this.vocabularyId = vocabularyId;
            return this;
        }
        public String getVocabularyId() {
            return this.vocabularyId;
        }

        public ListVocabResponseBodyData setWordWeightList(java.util.List<ListVocabResponseBodyDataWordWeightList> wordWeightList) {
            this.wordWeightList = wordWeightList;
            return this;
        }
        public java.util.List<ListVocabResponseBodyDataWordWeightList> getWordWeightList() {
            return this.wordWeightList;
        }

    }

}
