// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class ListUserSuppressionResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListUserSuppressionResponseBodyData data;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListUserSuppressionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserSuppressionResponseBody self = new ListUserSuppressionResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserSuppressionResponseBody setData(ListUserSuppressionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListUserSuppressionResponseBodyData getData() {
        return this.data;
    }

    public ListUserSuppressionResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListUserSuppressionResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListUserSuppressionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserSuppressionResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListUserSuppressionResponseBodyDataUserSuppressions extends TeaModel {
        @NameInMap("Address")
        public String address;

        @NameInMap("CreateTime")
        public Integer createTime;

        @NameInMap("LastBounceTime")
        public Integer lastBounceTime;

        @NameInMap("SuppressionId")
        public Integer suppressionId;

        @NameInMap("Type")
        public String type;

        public static ListUserSuppressionResponseBodyDataUserSuppressions build(java.util.Map<String, ?> map) throws Exception {
            ListUserSuppressionResponseBodyDataUserSuppressions self = new ListUserSuppressionResponseBodyDataUserSuppressions();
            return TeaModel.build(map, self);
        }

        public ListUserSuppressionResponseBodyDataUserSuppressions setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public ListUserSuppressionResponseBodyDataUserSuppressions setCreateTime(Integer createTime) {
            this.createTime = createTime;
            return this;
        }
        public Integer getCreateTime() {
            return this.createTime;
        }

        public ListUserSuppressionResponseBodyDataUserSuppressions setLastBounceTime(Integer lastBounceTime) {
            this.lastBounceTime = lastBounceTime;
            return this;
        }
        public Integer getLastBounceTime() {
            return this.lastBounceTime;
        }

        public ListUserSuppressionResponseBodyDataUserSuppressions setSuppressionId(Integer suppressionId) {
            this.suppressionId = suppressionId;
            return this;
        }
        public Integer getSuppressionId() {
            return this.suppressionId;
        }

        public ListUserSuppressionResponseBodyDataUserSuppressions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListUserSuppressionResponseBodyData extends TeaModel {
        @NameInMap("UserSuppressions")
        public java.util.List<ListUserSuppressionResponseBodyDataUserSuppressions> userSuppressions;

        public static ListUserSuppressionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListUserSuppressionResponseBodyData self = new ListUserSuppressionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListUserSuppressionResponseBodyData setUserSuppressions(java.util.List<ListUserSuppressionResponseBodyDataUserSuppressions> userSuppressions) {
            this.userSuppressions = userSuppressions;
            return this;
        }
        public java.util.List<ListUserSuppressionResponseBodyDataUserSuppressions> getUserSuppressions() {
            return this.userSuppressions;
        }

    }

}
