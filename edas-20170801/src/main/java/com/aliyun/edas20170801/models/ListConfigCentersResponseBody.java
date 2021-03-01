// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListConfigCentersResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ConfigCentersList")
    public ListConfigCentersResponseBodyConfigCentersList configCentersList;

    @NameInMap("Code")
    public Integer code;

    public static ListConfigCentersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListConfigCentersResponseBody self = new ListConfigCentersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListConfigCentersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListConfigCentersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListConfigCentersResponseBody setConfigCentersList(ListConfigCentersResponseBodyConfigCentersList configCentersList) {
        this.configCentersList = configCentersList;
        return this;
    }
    public ListConfigCentersResponseBodyConfigCentersList getConfigCentersList() {
        return this.configCentersList;
    }

    public ListConfigCentersResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public static class ListConfigCentersResponseBodyConfigCentersListListConfigCenters extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("DataId")
        public String dataId;

        @NameInMap("Id")
        public String id;

        @NameInMap("Group")
        public String group;

        public static ListConfigCentersResponseBodyConfigCentersListListConfigCenters build(java.util.Map<String, ?> map) throws Exception {
            ListConfigCentersResponseBodyConfigCentersListListConfigCenters self = new ListConfigCentersResponseBodyConfigCentersListListConfigCenters();
            return TeaModel.build(map, self);
        }

        public ListConfigCentersResponseBodyConfigCentersListListConfigCenters setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListConfigCentersResponseBodyConfigCentersListListConfigCenters setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public ListConfigCentersResponseBodyConfigCentersListListConfigCenters setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListConfigCentersResponseBodyConfigCentersListListConfigCenters setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

    }

    public static class ListConfigCentersResponseBodyConfigCentersList extends TeaModel {
        @NameInMap("ListConfigCenters")
        public java.util.List<ListConfigCentersResponseBodyConfigCentersListListConfigCenters> listConfigCenters;

        public static ListConfigCentersResponseBodyConfigCentersList build(java.util.Map<String, ?> map) throws Exception {
            ListConfigCentersResponseBodyConfigCentersList self = new ListConfigCentersResponseBodyConfigCentersList();
            return TeaModel.build(map, self);
        }

        public ListConfigCentersResponseBodyConfigCentersList setListConfigCenters(java.util.List<ListConfigCentersResponseBodyConfigCentersListListConfigCenters> listConfigCenters) {
            this.listConfigCenters = listConfigCenters;
            return this;
        }
        public java.util.List<ListConfigCentersResponseBodyConfigCentersListListConfigCenters> getListConfigCenters() {
            return this.listConfigCenters;
        }

    }

}
