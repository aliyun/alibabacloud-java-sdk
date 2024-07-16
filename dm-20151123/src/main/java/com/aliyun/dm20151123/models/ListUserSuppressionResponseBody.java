// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class ListUserSuppressionResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListUserSuppressionResponseBodyData data;

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
     * <p>1A846D66-5EC7-551B-9687-5BF1963DCFC1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p><a href="mailto:test@example.net">test@example.net</a></p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <strong>example:</strong>
         * <p>1715667435</p>
         */
        @NameInMap("CreateTime")
        public Integer createTime;

        /**
         * <strong>example:</strong>
         * <p>1715667451</p>
         */
        @NameInMap("LastBounceTime")
        public Integer lastBounceTime;

        /**
         * <strong>example:</strong>
         * <p>59511</p>
         */
        @NameInMap("SuppressionId")
        public Integer suppressionId;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li>system</li>
         * <li>user</li>
         * </ul>
         */
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
