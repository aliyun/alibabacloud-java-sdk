// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ListUserSayResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

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
        // 槽位在意图话术中的下标
        @NameInMap("EndIndex")
        public Integer endIndex;

        // 意图槽位ID
        @NameInMap("SlotId")
        public String slotId;

        // 槽位在意图话术中的下标
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
        @NameInMap("Content")
        public String content;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("IntentId")
        public Long intentId;

        @NameInMap("ModifyTime")
        public String modifyTime;

        @NameInMap("SlotInfos")
        public java.util.List<ListUserSayResponseBodyUserSaysSlotInfos> slotInfos;

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
