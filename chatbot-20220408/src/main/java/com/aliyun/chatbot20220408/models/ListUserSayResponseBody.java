// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ListUserSayResponseBody extends TeaModel {
    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>fs1fg4512v43572v23</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The list of utterances.</p>
     */
    @NameInMap("UserSays")
    public java.util.List<ListUserSayResponseBodyUserSays> userSays;

    public static ListUserSayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserSayResponseBody self = new ListUserSayResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserSayResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListUserSayResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListUserSayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserSayResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListUserSayResponseBody setUserSays(java.util.List<ListUserSayResponseBodyUserSays> userSays) {
        this.userSays = userSays;
        return this;
    }
    public java.util.List<ListUserSayResponseBodyUserSays> getUserSays() {
        return this.userSays;
    }

    public static class ListUserSayResponseBodyUserSaysSlotInfos extends TeaModel {
        /**
         * <p>The end index of the slot in the intent utterance (exclusive).</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("EndIndex")
        public Integer endIndex;

        /**
         * <p>The intent slot ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3456sdfg3tu</p>
         */
        @NameInMap("SlotId")
        public String slotId;

        /**
         * <p>The start index of the slot in the intent utterance.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("StartIndex")
        public Integer startIndex;

        public static ListUserSayResponseBodyUserSaysSlotInfos build(java.util.Map<String, ?> map) throws Exception {
            ListUserSayResponseBodyUserSaysSlotInfos self = new ListUserSayResponseBodyUserSaysSlotInfos();
            return TeaModel.build(map, self);
        }

        public ListUserSayResponseBodyUserSaysSlotInfos setEndIndex(Integer endIndex) {
            this.endIndex = endIndex;
            return this;
        }
        public Integer getEndIndex() {
            return this.endIndex;
        }

        public ListUserSayResponseBodyUserSaysSlotInfos setSlotId(String slotId) {
            this.slotId = slotId;
            return this;
        }
        public String getSlotId() {
            return this.slotId;
        }

        public ListUserSayResponseBodyUserSaysSlotInfos setStartIndex(Integer startIndex) {
            this.startIndex = startIndex;
            return this;
        }
        public Integer getStartIndex() {
            return this.startIndex;
        }

    }

    public static class ListUserSayResponseBodyUserSays extends TeaModel {
        /**
         * <p>The utterance content.</p>
         * 
         * <strong>example:</strong>
         * <p>Have you taken a COVID test</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The time when the utterance was created, in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-08-12T16:00:01Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The intent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>235564564</p>
         */
        @NameInMap("IntentId")
        public Long intentId;

        /**
         * <p>The time when the utterance was last modified, in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-08-12T16:00:01Z</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The associated slot information.</p>
         */
        @NameInMap("SlotInfos")
        public java.util.List<ListUserSayResponseBodyUserSaysSlotInfos> slotInfos;

        /**
         * <p>The utterance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3453452138</p>
         */
        @NameInMap("UserSayId")
        public Long userSayId;

        public static ListUserSayResponseBodyUserSays build(java.util.Map<String, ?> map) throws Exception {
            ListUserSayResponseBodyUserSays self = new ListUserSayResponseBodyUserSays();
            return TeaModel.build(map, self);
        }

        public ListUserSayResponseBodyUserSays setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListUserSayResponseBodyUserSays setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListUserSayResponseBodyUserSays setIntentId(Long intentId) {
            this.intentId = intentId;
            return this;
        }
        public Long getIntentId() {
            return this.intentId;
        }

        public ListUserSayResponseBodyUserSays setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListUserSayResponseBodyUserSays setSlotInfos(java.util.List<ListUserSayResponseBodyUserSaysSlotInfos> slotInfos) {
            this.slotInfos = slotInfos;
            return this;
        }
        public java.util.List<ListUserSayResponseBodyUserSaysSlotInfos> getSlotInfos() {
            return this.slotInfos;
        }

        public ListUserSayResponseBodyUserSays setUserSayId(Long userSayId) {
            this.userSayId = userSayId;
            return this;
        }
        public Long getUserSayId() {
            return this.userSayId;
        }

    }

}
