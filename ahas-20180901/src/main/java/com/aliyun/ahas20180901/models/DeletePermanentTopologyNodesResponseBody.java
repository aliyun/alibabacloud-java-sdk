// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class DeletePermanentTopologyNodesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<DeletePermanentTopologyNodesResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DeletePermanentTopologyNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePermanentTopologyNodesResponseBody self = new DeletePermanentTopologyNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePermanentTopologyNodesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeletePermanentTopologyNodesResponseBody setData(java.util.List<DeletePermanentTopologyNodesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DeletePermanentTopologyNodesResponseBodyData> getData() {
        return this.data;
    }

    public DeletePermanentTopologyNodesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeletePermanentTopologyNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeletePermanentTopologyNodesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeletePermanentTopologyNodesResponseBodyData extends TeaModel {
        @NameInMap("icon")
        public String icon;

        @NameInMap("id")
        public String id;

        @NameInMap("instanceId")
        public String instanceId;

        @NameInMap("name")
        public String name;

        @NameInMap("nameMinor")
        public String nameMinor;

        @NameInMap("type")
        public Integer type;

        @NameInMap("viewId")
        public String viewId;

        @NameInMap("zone")
        public String zone;

        public static DeletePermanentTopologyNodesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeletePermanentTopologyNodesResponseBodyData self = new DeletePermanentTopologyNodesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeletePermanentTopologyNodesResponseBodyData setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public DeletePermanentTopologyNodesResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DeletePermanentTopologyNodesResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DeletePermanentTopologyNodesResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DeletePermanentTopologyNodesResponseBodyData setNameMinor(String nameMinor) {
            this.nameMinor = nameMinor;
            return this;
        }
        public String getNameMinor() {
            return this.nameMinor;
        }

        public DeletePermanentTopologyNodesResponseBodyData setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public DeletePermanentTopologyNodesResponseBodyData setViewId(String viewId) {
            this.viewId = viewId;
            return this;
        }
        public String getViewId() {
            return this.viewId;
        }

        public DeletePermanentTopologyNodesResponseBodyData setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

    }

}
