// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class SetEnvironmentDefaultDomainResponseBody extends TeaModel {
    @NameInMap("Data")
    public SetEnvironmentDefaultDomainResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static SetEnvironmentDefaultDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetEnvironmentDefaultDomainResponseBody self = new SetEnvironmentDefaultDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public SetEnvironmentDefaultDomainResponseBody setData(SetEnvironmentDefaultDomainResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SetEnvironmentDefaultDomainResponseBodyData getData() {
        return this.data;
    }

    public SetEnvironmentDefaultDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SetEnvironmentDefaultDomainResponseBodyData extends TeaModel {
        @NameInMap("ConfigChanged")
        public Boolean configChanged;

        @NameInMap("DefaultMasterDomain")
        public String defaultMasterDomain;

        @NameInMap("DefaultStaticDomain")
        public String defaultStaticDomain;

        @NameInMap("MasterDomain")
        public String masterDomain;

        @NameInMap("MasterDomainApplied")
        public Boolean masterDomainApplied;

        @NameInMap("StaticDomain")
        public String staticDomain;

        @NameInMap("StaticDomainApplied")
        public Boolean staticDomainApplied;

        public static SetEnvironmentDefaultDomainResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SetEnvironmentDefaultDomainResponseBodyData self = new SetEnvironmentDefaultDomainResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SetEnvironmentDefaultDomainResponseBodyData setConfigChanged(Boolean configChanged) {
            this.configChanged = configChanged;
            return this;
        }
        public Boolean getConfigChanged() {
            return this.configChanged;
        }

        public SetEnvironmentDefaultDomainResponseBodyData setDefaultMasterDomain(String defaultMasterDomain) {
            this.defaultMasterDomain = defaultMasterDomain;
            return this;
        }
        public String getDefaultMasterDomain() {
            return this.defaultMasterDomain;
        }

        public SetEnvironmentDefaultDomainResponseBodyData setDefaultStaticDomain(String defaultStaticDomain) {
            this.defaultStaticDomain = defaultStaticDomain;
            return this;
        }
        public String getDefaultStaticDomain() {
            return this.defaultStaticDomain;
        }

        public SetEnvironmentDefaultDomainResponseBodyData setMasterDomain(String masterDomain) {
            this.masterDomain = masterDomain;
            return this;
        }
        public String getMasterDomain() {
            return this.masterDomain;
        }

        public SetEnvironmentDefaultDomainResponseBodyData setMasterDomainApplied(Boolean masterDomainApplied) {
            this.masterDomainApplied = masterDomainApplied;
            return this;
        }
        public Boolean getMasterDomainApplied() {
            return this.masterDomainApplied;
        }

        public SetEnvironmentDefaultDomainResponseBodyData setStaticDomain(String staticDomain) {
            this.staticDomain = staticDomain;
            return this;
        }
        public String getStaticDomain() {
            return this.staticDomain;
        }

        public SetEnvironmentDefaultDomainResponseBodyData setStaticDomainApplied(Boolean staticDomainApplied) {
            this.staticDomainApplied = staticDomainApplied;
            return this;
        }
        public Boolean getStaticDomainApplied() {
            return this.staticDomainApplied;
        }

    }

}
