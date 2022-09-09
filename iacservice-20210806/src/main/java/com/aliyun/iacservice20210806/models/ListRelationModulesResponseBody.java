// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListRelationModulesResponseBody extends TeaModel {
    @NameInMap("modules")
    public java.util.List<ListRelationModulesResponseBodyModules> modules;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListRelationModulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRelationModulesResponseBody self = new ListRelationModulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRelationModulesResponseBody setModules(java.util.List<ListRelationModulesResponseBodyModules> modules) {
        this.modules = modules;
        return this;
    }
    public java.util.List<ListRelationModulesResponseBodyModules> getModules() {
        return this.modules;
    }

    public ListRelationModulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRelationModulesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListRelationModulesResponseBodyModules extends TeaModel {
        @NameInMap("latestVersion")
        public String latestVersion;

        @NameInMap("moduleId")
        public String moduleId;

        @NameInMap("name")
        public String name;

        public static ListRelationModulesResponseBodyModules build(java.util.Map<String, ?> map) throws Exception {
            ListRelationModulesResponseBodyModules self = new ListRelationModulesResponseBodyModules();
            return TeaModel.build(map, self);
        }

        public ListRelationModulesResponseBodyModules setLatestVersion(String latestVersion) {
            this.latestVersion = latestVersion;
            return this;
        }
        public String getLatestVersion() {
            return this.latestVersion;
        }

        public ListRelationModulesResponseBodyModules setModuleId(String moduleId) {
            this.moduleId = moduleId;
            return this;
        }
        public String getModuleId() {
            return this.moduleId;
        }

        public ListRelationModulesResponseBodyModules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
