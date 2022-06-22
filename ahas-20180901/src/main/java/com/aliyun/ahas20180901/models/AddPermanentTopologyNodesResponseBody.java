// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class AddPermanentTopologyNodesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<AddPermanentTopologyNodesResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static AddPermanentTopologyNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddPermanentTopologyNodesResponseBody self = new AddPermanentTopologyNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public AddPermanentTopologyNodesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddPermanentTopologyNodesResponseBody setData(java.util.List<AddPermanentTopologyNodesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<AddPermanentTopologyNodesResponseBodyData> getData() {
        return this.data;
    }

    public AddPermanentTopologyNodesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddPermanentTopologyNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddPermanentTopologyNodesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AddPermanentTopologyNodesResponseBodyData extends TeaModel {
        @NameInMap("ExtFields")
        public java.util.List<java.util.Map<String, ?>> extFields;

        @NameInMap("hostConfigurationId")
        public String hostConfigurationId;

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

        public static AddPermanentTopologyNodesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddPermanentTopologyNodesResponseBodyData self = new AddPermanentTopologyNodesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddPermanentTopologyNodesResponseBodyData setExtFields(java.util.List<java.util.Map<String, ?>> extFields) {
            this.extFields = extFields;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getExtFields() {
            return this.extFields;
        }

        public AddPermanentTopologyNodesResponseBodyData setHostConfigurationId(String hostConfigurationId) {
            this.hostConfigurationId = hostConfigurationId;
            return this;
        }
        public String getHostConfigurationId() {
            return this.hostConfigurationId;
        }

        public AddPermanentTopologyNodesResponseBodyData setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public AddPermanentTopologyNodesResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public AddPermanentTopologyNodesResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public AddPermanentTopologyNodesResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AddPermanentTopologyNodesResponseBodyData setNameMinor(String nameMinor) {
            this.nameMinor = nameMinor;
            return this;
        }
        public String getNameMinor() {
            return this.nameMinor;
        }

        public AddPermanentTopologyNodesResponseBodyData setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public AddPermanentTopologyNodesResponseBodyData setViewId(String viewId) {
            this.viewId = viewId;
            return this;
        }
        public String getViewId() {
            return this.viewId;
        }

        public AddPermanentTopologyNodesResponseBodyData setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

    }

}
