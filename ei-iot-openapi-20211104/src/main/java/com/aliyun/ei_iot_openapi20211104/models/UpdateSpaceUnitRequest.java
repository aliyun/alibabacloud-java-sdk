// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ei_iot_openapi20211104.models;

import com.aliyun.tea.*;

public class UpdateSpaceUnitRequest extends TeaModel {
    @NameInMap("App")
    public App app;

    @NameInMap("BizRequest")
    public UpdateSpaceUnitRequestBizRequest bizRequest;

    @NameInMap("Tenant")
    public Tenant tenant;

    public static UpdateSpaceUnitRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSpaceUnitRequest self = new UpdateSpaceUnitRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSpaceUnitRequest setApp(App app) {
        this.app = app;
        return this;
    }
    public App getApp() {
        return this.app;
    }

    public UpdateSpaceUnitRequest setBizRequest(UpdateSpaceUnitRequestBizRequest bizRequest) {
        this.bizRequest = bizRequest;
        return this;
    }
    public UpdateSpaceUnitRequestBizRequest getBizRequest() {
        return this.bizRequest;
    }

    public UpdateSpaceUnitRequest setTenant(Tenant tenant) {
        this.tenant = tenant;
        return this;
    }
    public Tenant getTenant() {
        return this.tenant;
    }

    public static class UpdateSpaceUnitRequestBizRequest extends TeaModel {
        @NameInMap("RegionCode")
        public String regionCode;

        @NameInMap("RegionName")
        public String regionName;

        @NameInMap("TypeCode")
        public String typeCode;

        @NameInMap("TypeName")
        public String typeName;

        @NameInMap("UnitId")
        public String unitId;

        @NameInMap("UnitName")
        public String unitName;

        public static UpdateSpaceUnitRequestBizRequest build(java.util.Map<String, ?> map) throws Exception {
            UpdateSpaceUnitRequestBizRequest self = new UpdateSpaceUnitRequestBizRequest();
            return TeaModel.build(map, self);
        }

        public UpdateSpaceUnitRequestBizRequest setRegionCode(String regionCode) {
            this.regionCode = regionCode;
            return this;
        }
        public String getRegionCode() {
            return this.regionCode;
        }

        public UpdateSpaceUnitRequestBizRequest setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public UpdateSpaceUnitRequestBizRequest setTypeCode(String typeCode) {
            this.typeCode = typeCode;
            return this;
        }
        public String getTypeCode() {
            return this.typeCode;
        }

        public UpdateSpaceUnitRequestBizRequest setTypeName(String typeName) {
            this.typeName = typeName;
            return this;
        }
        public String getTypeName() {
            return this.typeName;
        }

        public UpdateSpaceUnitRequestBizRequest setUnitId(String unitId) {
            this.unitId = unitId;
            return this;
        }
        public String getUnitId() {
            return this.unitId;
        }

        public UpdateSpaceUnitRequestBizRequest setUnitName(String unitName) {
            this.unitName = unitName;
            return this;
        }
        public String getUnitName() {
            return this.unitName;
        }

    }

}
