// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ListDSEntityValueResponseBody extends TeaModel {
    @NameInMap("EntityValues")
    public java.util.List<ListDSEntityValueResponseBodyEntityValues> entityValues;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Content")
        public String content;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("EntityId")
        public Long entityId;

        @NameInMap("EntityValueId")
        public Long entityValueId;

        @NameInMap("ModifyTime")
        public String modifyTime;

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
