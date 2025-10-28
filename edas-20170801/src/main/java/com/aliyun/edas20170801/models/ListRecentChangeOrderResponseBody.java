// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListRecentChangeOrderResponseBody extends TeaModel {
    /**
     * <p>The information about change processes.</p>
     */
    @NameInMap("ChangeOrderList")
    public ListRecentChangeOrderResponseBodyChangeOrderList changeOrderList;

    /**
     * <p>The HTTP status code that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The additional information that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D16979DC-4D42-************</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListRecentChangeOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRecentChangeOrderResponseBody self = new ListRecentChangeOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRecentChangeOrderResponseBody setChangeOrderList(ListRecentChangeOrderResponseBodyChangeOrderList changeOrderList) {
        this.changeOrderList = changeOrderList;
        return this;
    }
    public ListRecentChangeOrderResponseBodyChangeOrderList getChangeOrderList() {
        return this.changeOrderList;
    }

    public ListRecentChangeOrderResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListRecentChangeOrderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListRecentChangeOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListRecentChangeOrderResponseBodyChangeOrderListChangeOrder extends TeaModel {
        /**
         * <p>The ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>3616cdca-4f92-4413-<strong><strong>-</strong></strong>********</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The number of batches for the change. Valid values: 1 to 5.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BatchCount")
        public Integer batchCount;

        /**
         * <p>The way in which the next batch is triggered during a phased release. Valid values:</p>
         * <ul>
         * <li>Automatic</li>
         * <li>Manual</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Automatic</p>
         */
        @NameInMap("BatchType")
        public String batchType;

        /**
         * <p>The description of the change process.</p>
         * 
         * <strong>example:</strong>
         * <p>Version: 2020-05-14 20:02:33 | Deployment Package: hsf-pandora-boot-provider-1.0.jar | Deploy to: all groups</p>
         */
        @NameInMap("ChangeOrderDescription")
        public String changeOrderDescription;

        /**
         * <p>The unique ID of the change process.</p>
         * 
         * <strong>example:</strong>
         * <p>1074f3e2-e974-4a0e-<strong><strong>-</strong></strong>********</p>
         */
        @NameInMap("ChangeOrderId")
        public String changeOrderId;

        /**
         * <p>The type of the change process.</p>
         * 
         * <strong>example:</strong>
         * <p>Application Scale Out</p>
         */
        @NameInMap("CoType")
        public String coType;

        /**
         * <p>The type of the change process.</p>
         * 
         * <strong>example:</strong>
         * <p>CoDeploy</p>
         */
        @NameInMap("CoTypeCode")
        public String coTypeCode;

        /**
         * <p>The time when the change process was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-11-13 14:23:46</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The user who created the change process.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:edas_test1@aliyun-test.com">edas_test1@aliyun-test.com</a></p>
         */
        @NameInMap("CreateUserId")
        public String createUserId;

        /**
         * <p>The time when the change process ended.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-11-13 14:24:02</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The ID of the application instance group on which the change was performed.</p>
         * 
         * <strong>example:</strong>
         * <p>8123db90-880f-486f-<strong><strong>-</strong></strong>********</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The source of the change. Valid values:</p>
         * <ul>
         * <li>console: the Enterprise Distributed Application Service (EDAS) console</li>
         * <li>pop: the POP API or tool</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pop</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The state of the change process. Valid values:</p>
         * <ul>
         * <li>0: ready to start execution</li>
         * <li>1: in progress</li>
         * <li>2: successful</li>
         * <li>3: failed</li>
         * <li>6: terminated</li>
         * <li>8: waiting for manual confirmation (You can see the state when you manually confirm the execution of the next batch of the change.)</li>
         * <li>9: waiting for automatic execution</li>
         * <li>10: failed due to a system error</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The ID of the user who created the change process.</p>
         * 
         * <strong>example:</strong>
         * <p>1432536****</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static ListRecentChangeOrderResponseBodyChangeOrderListChangeOrder build(java.util.Map<String, ?> map) throws Exception {
            ListRecentChangeOrderResponseBodyChangeOrderListChangeOrder self = new ListRecentChangeOrderResponseBodyChangeOrderListChangeOrder();
            return TeaModel.build(map, self);
        }

        public ListRecentChangeOrderResponseBodyChangeOrderListChangeOrder setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListRecentChangeOrderResponseBodyChangeOrderListChangeOrder setBatchCount(Integer batchCount) {
            this.batchCount = batchCount;
            return this;
        }
        public Integer getBatchCount() {
            return this.batchCount;
        }

        public ListRecentChangeOrderResponseBodyChangeOrderListChangeOrder setBatchType(String batchType) {
            this.batchType = batchType;
            return this;
        }
        public String getBatchType() {
            return this.batchType;
        }

        public ListRecentChangeOrderResponseBodyChangeOrderListChangeOrder setChangeOrderDescription(String changeOrderDescription) {
            this.changeOrderDescription = changeOrderDescription;
            return this;
        }
        public String getChangeOrderDescription() {
            return this.changeOrderDescription;
        }

        public ListRecentChangeOrderResponseBodyChangeOrderListChangeOrder setChangeOrderId(String changeOrderId) {
            this.changeOrderId = changeOrderId;
            return this;
        }
        public String getChangeOrderId() {
            return this.changeOrderId;
        }

        public ListRecentChangeOrderResponseBodyChangeOrderListChangeOrder setCoType(String coType) {
            this.coType = coType;
            return this;
        }
        public String getCoType() {
            return this.coType;
        }

        public ListRecentChangeOrderResponseBodyChangeOrderListChangeOrder setCoTypeCode(String coTypeCode) {
            this.coTypeCode = coTypeCode;
            return this;
        }
        public String getCoTypeCode() {
            return this.coTypeCode;
        }

        public ListRecentChangeOrderResponseBodyChangeOrderListChangeOrder setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListRecentChangeOrderResponseBodyChangeOrderListChangeOrder setCreateUserId(String createUserId) {
            this.createUserId = createUserId;
            return this;
        }
        public String getCreateUserId() {
            return this.createUserId;
        }

        public ListRecentChangeOrderResponseBodyChangeOrderListChangeOrder setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public ListRecentChangeOrderResponseBodyChangeOrderListChangeOrder setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListRecentChangeOrderResponseBodyChangeOrderListChangeOrder setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListRecentChangeOrderResponseBodyChangeOrderListChangeOrder setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListRecentChangeOrderResponseBodyChangeOrderListChangeOrder setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class ListRecentChangeOrderResponseBodyChangeOrderList extends TeaModel {
        @NameInMap("ChangeOrder")
        public java.util.List<ListRecentChangeOrderResponseBodyChangeOrderListChangeOrder> changeOrder;

        public static ListRecentChangeOrderResponseBodyChangeOrderList build(java.util.Map<String, ?> map) throws Exception {
            ListRecentChangeOrderResponseBodyChangeOrderList self = new ListRecentChangeOrderResponseBodyChangeOrderList();
            return TeaModel.build(map, self);
        }

        public ListRecentChangeOrderResponseBodyChangeOrderList setChangeOrder(java.util.List<ListRecentChangeOrderResponseBodyChangeOrderListChangeOrder> changeOrder) {
            this.changeOrder = changeOrder;
            return this;
        }
        public java.util.List<ListRecentChangeOrderResponseBodyChangeOrderListChangeOrder> getChangeOrder() {
            return this.changeOrder;
        }

    }

}
