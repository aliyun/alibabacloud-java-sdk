// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ListDSEntityValueResponseBody extends TeaModel {
    /**
     * <p>A list of entity values.</p>
     */
    @NameInMap("EntityValues")
    public java.util.List<ListDSEntityValueResponseBodyEntityValues> entityValues;

    /**
     * <p>The page number of the returned results.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries on the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The unique request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>n3fg34gbfj8adf2gj923</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total count of matching entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListDSEntityValueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDSEntityValueResponseBody self = new ListDSEntityValueResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDSEntityValueResponseBody setEntityValues(java.util.List<ListDSEntityValueResponseBodyEntityValues> entityValues) {
        this.entityValues = entityValues;
        return this;
    }
    public java.util.List<ListDSEntityValueResponseBodyEntityValues> getEntityValues() {
        return this.entityValues;
    }

    public ListDSEntityValueResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDSEntityValueResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDSEntityValueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDSEntityValueResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListDSEntityValueResponseBodyEntityValues extends TeaModel {
        /**
         * <p>The content of the entity value, which can be a standard value or a regular expression.</p>
         * 
         * <strong>example:</strong>
         * <p>书类型</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The creation time of the entity value in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-08-12T16:00:01Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the entity.</p>
         * 
         * <strong>example:</strong>
         * <p>34313785463</p>
         */
        @NameInMap("EntityId")
        public Long entityId;

        /**
         * <p>The ID of the entity value.</p>
         * 
         * <strong>example:</strong>
         * <p>3467858234534534532</p>
         */
        @NameInMap("EntityValueId")
        public Long entityValueId;

        /**
         * <p>The last modification time of the entity value in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-08-12T16:00:01Z</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>A list of synonyms for the entity value.</p>
         */
        @NameInMap("Synonyms")
        public java.util.List<String> synonyms;

        public static ListDSEntityValueResponseBodyEntityValues build(java.util.Map<String, ?> map) throws Exception {
            ListDSEntityValueResponseBodyEntityValues self = new ListDSEntityValueResponseBodyEntityValues();
            return TeaModel.build(map, self);
        }

        public ListDSEntityValueResponseBodyEntityValues setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListDSEntityValueResponseBodyEntityValues setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListDSEntityValueResponseBodyEntityValues setEntityId(Long entityId) {
            this.entityId = entityId;
            return this;
        }
        public Long getEntityId() {
            return this.entityId;
        }

        public ListDSEntityValueResponseBodyEntityValues setEntityValueId(Long entityValueId) {
            this.entityValueId = entityValueId;
            return this;
        }
        public Long getEntityValueId() {
            return this.entityValueId;
        }

        public ListDSEntityValueResponseBodyEntityValues setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListDSEntityValueResponseBodyEntityValues setSynonyms(java.util.List<String> synonyms) {
            this.synonyms = synonyms;
            return this;
        }
        public java.util.List<String> getSynonyms() {
            return this.synonyms;
        }

    }

}
