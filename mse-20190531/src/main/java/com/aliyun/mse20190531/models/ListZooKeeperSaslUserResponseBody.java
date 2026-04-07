// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListZooKeeperSaslUserResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListZooKeeperSaslUserResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>6C075654-E42F-5F58-914F-E11DA70881B7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListZooKeeperSaslUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListZooKeeperSaslUserResponseBody self = new ListZooKeeperSaslUserResponseBody();
        return TeaModel.build(map, self);
    }

    public ListZooKeeperSaslUserResponseBody setData(java.util.List<ListZooKeeperSaslUserResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListZooKeeperSaslUserResponseBodyData> getData() {
        return this.data;
    }

    public ListZooKeeperSaslUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListZooKeeperSaslUserResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1631001140913</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>UserAddNeedReload</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static ListZooKeeperSaslUserResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListZooKeeperSaslUserResponseBodyData self = new ListZooKeeperSaslUserResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListZooKeeperSaslUserResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListZooKeeperSaslUserResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListZooKeeperSaslUserResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListZooKeeperSaslUserResponseBodyData setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
