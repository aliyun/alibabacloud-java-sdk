// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class DataModuleMapListSpnTypeMapListValue extends TeaModel {
    @NameInMap("FilterModules")
    public java.util.List<DataModuleMapListSpnTypeMapListValueFilterModules> filterModules;

    @NameInMap("ShowModules")
    public java.util.List<DataModuleMapListSpnTypeMapListValueShowModules> showModules;

    public static DataModuleMapListSpnTypeMapListValue build(java.util.Map<String, ?> map) throws Exception {
        DataModuleMapListSpnTypeMapListValue self = new DataModuleMapListSpnTypeMapListValue();
        return TeaModel.build(map, self);
    }

    public DataModuleMapListSpnTypeMapListValue setFilterModules(java.util.List<DataModuleMapListSpnTypeMapListValueFilterModules> filterModules) {
        this.filterModules = filterModules;
        return this;
    }
    public java.util.List<DataModuleMapListSpnTypeMapListValueFilterModules> getFilterModules() {
        return this.filterModules;
    }

    public DataModuleMapListSpnTypeMapListValue setShowModules(java.util.List<DataModuleMapListSpnTypeMapListValueShowModules> showModules) {
        this.showModules = showModules;
        return this;
    }
    public java.util.List<DataModuleMapListSpnTypeMapListValueShowModules> getShowModules() {
        return this.showModules;
    }

    public static class DataModuleMapListSpnTypeMapListValueFilterModules extends TeaModel {
        @NameInMap("ModuleId")
        public Long moduleId;

        @NameInMap("ModuleCode")
        public String moduleCode;

        @NameInMap("ModuleName")
        public String moduleName;

        public static DataModuleMapListSpnTypeMapListValueFilterModules build(java.util.Map<String, ?> map) throws Exception {
            DataModuleMapListSpnTypeMapListValueFilterModules self = new DataModuleMapListSpnTypeMapListValueFilterModules();
            return TeaModel.build(map, self);
        }

        public DataModuleMapListSpnTypeMapListValueFilterModules setModuleId(Long moduleId) {
            this.moduleId = moduleId;
            return this;
        }
        public Long getModuleId() {
            return this.moduleId;
        }

        public DataModuleMapListSpnTypeMapListValueFilterModules setModuleCode(String moduleCode) {
            this.moduleCode = moduleCode;
            return this;
        }
        public String getModuleCode() {
            return this.moduleCode;
        }

        public DataModuleMapListSpnTypeMapListValueFilterModules setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

    }

    public static class DataModuleMapListSpnTypeMapListValueShowModules extends TeaModel {
        @NameInMap("ModuleId")
        public Long moduleId;

        @NameInMap("ModuleCode")
        public String moduleCode;

        @NameInMap("ModuleName")
        public String moduleName;

        public static DataModuleMapListSpnTypeMapListValueShowModules build(java.util.Map<String, ?> map) throws Exception {
            DataModuleMapListSpnTypeMapListValueShowModules self = new DataModuleMapListSpnTypeMapListValueShowModules();
            return TeaModel.build(map, self);
        }

        public DataModuleMapListSpnTypeMapListValueShowModules setModuleId(Long moduleId) {
            this.moduleId = moduleId;
            return this;
        }
        public Long getModuleId() {
            return this.moduleId;
        }

        public DataModuleMapListSpnTypeMapListValueShowModules setModuleCode(String moduleCode) {
            this.moduleCode = moduleCode;
            return this;
        }
        public String getModuleCode() {
            return this.moduleCode;
        }

        public DataModuleMapListSpnTypeMapListValueShowModules setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

    }

}
