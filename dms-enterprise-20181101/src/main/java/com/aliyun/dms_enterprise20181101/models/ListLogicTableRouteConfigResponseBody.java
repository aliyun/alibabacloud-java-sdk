// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListLogicTableRouteConfigResponseBody extends TeaModel {
    /**
     * <p>The error code returned.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The routing algorithms.</p>
     */
    @NameInMap("LogicTableRouteConfigList")
    public ListLogicTableRouteConfigResponseBodyLogicTableRouteConfigList logicTableRouteConfigList;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>- **true**: The request was successful.</p>
     * <p>- **false**: The request failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListLogicTableRouteConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLogicTableRouteConfigResponseBody self = new ListLogicTableRouteConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLogicTableRouteConfigResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListLogicTableRouteConfigResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListLogicTableRouteConfigResponseBody setLogicTableRouteConfigList(ListLogicTableRouteConfigResponseBodyLogicTableRouteConfigList logicTableRouteConfigList) {
        this.logicTableRouteConfigList = logicTableRouteConfigList;
        return this;
    }
    public ListLogicTableRouteConfigResponseBodyLogicTableRouteConfigList getLogicTableRouteConfigList() {
        return this.logicTableRouteConfigList;
    }

    public ListLogicTableRouteConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLogicTableRouteConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListLogicTableRouteConfigResponseBodyLogicTableRouteConfigListLogicTableRouteConfig extends TeaModel {
        /**
         * <p>The routing algorithm expression.</p>
         */
        @NameInMap("RouteExpr")
        public String routeExpr;

        /**
         * <p>The unique key of the routing algorithm.</p>
         */
        @NameInMap("RouteKey")
        public String routeKey;

        /**
         * <p>The ID of the logical table.</p>
         */
        @NameInMap("TableId")
        public Long tableId;

        public static ListLogicTableRouteConfigResponseBodyLogicTableRouteConfigListLogicTableRouteConfig build(java.util.Map<String, ?> map) throws Exception {
            ListLogicTableRouteConfigResponseBodyLogicTableRouteConfigListLogicTableRouteConfig self = new ListLogicTableRouteConfigResponseBodyLogicTableRouteConfigListLogicTableRouteConfig();
            return TeaModel.build(map, self);
        }

        public ListLogicTableRouteConfigResponseBodyLogicTableRouteConfigListLogicTableRouteConfig setRouteExpr(String routeExpr) {
            this.routeExpr = routeExpr;
            return this;
        }
        public String getRouteExpr() {
            return this.routeExpr;
        }

        public ListLogicTableRouteConfigResponseBodyLogicTableRouteConfigListLogicTableRouteConfig setRouteKey(String routeKey) {
            this.routeKey = routeKey;
            return this;
        }
        public String getRouteKey() {
            return this.routeKey;
        }

        public ListLogicTableRouteConfigResponseBodyLogicTableRouteConfigListLogicTableRouteConfig setTableId(Long tableId) {
            this.tableId = tableId;
            return this;
        }
        public Long getTableId() {
            return this.tableId;
        }

    }

    public static class ListLogicTableRouteConfigResponseBodyLogicTableRouteConfigList extends TeaModel {
        @NameInMap("LogicTableRouteConfig")
        public java.util.List<ListLogicTableRouteConfigResponseBodyLogicTableRouteConfigListLogicTableRouteConfig> logicTableRouteConfig;

        public static ListLogicTableRouteConfigResponseBodyLogicTableRouteConfigList build(java.util.Map<String, ?> map) throws Exception {
            ListLogicTableRouteConfigResponseBodyLogicTableRouteConfigList self = new ListLogicTableRouteConfigResponseBodyLogicTableRouteConfigList();
            return TeaModel.build(map, self);
        }

        public ListLogicTableRouteConfigResponseBodyLogicTableRouteConfigList setLogicTableRouteConfig(java.util.List<ListLogicTableRouteConfigResponseBodyLogicTableRouteConfigListLogicTableRouteConfig> logicTableRouteConfig) {
            this.logicTableRouteConfig = logicTableRouteConfig;
            return this;
        }
        public java.util.List<ListLogicTableRouteConfigResponseBodyLogicTableRouteConfigListLogicTableRouteConfig> getLogicTableRouteConfig() {
            return this.logicTableRouteConfig;
        }

    }

}
