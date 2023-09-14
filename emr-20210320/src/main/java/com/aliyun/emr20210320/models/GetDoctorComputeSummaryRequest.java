// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class GetDoctorComputeSummaryRequest extends TeaModel {
    /**
     * <p>集群ID。</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ComponentInfo")
    public ComponentInfo componentInfo;

    @NameInMap("DateTime")
    public String dateTime;

    /**
     * <p>区域ID。</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetDoctorComputeSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDoctorComputeSummaryRequest self = new GetDoctorComputeSummaryRequest();
        return TeaModel.build(map, self);
    }

    public GetDoctorComputeSummaryRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetDoctorComputeSummaryRequest setComponentInfo(ComponentInfo componentInfo) {
        this.componentInfo = componentInfo;
        return this;
    }
    public ComponentInfo getComponentInfo() {
        return this.componentInfo;
    }

    public GetDoctorComputeSummaryRequest setDateTime(String dateTime) {
        this.dateTime = dateTime;
        return this;
    }
    public String getDateTime() {
        return this.dateTime;
    }

    public GetDoctorComputeSummaryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class ComponentInfo extends TeaModel {
        @NameInMap("ComponentName")
        public String componentName;

        @NameInMap("ComponentType")
        public String componentType;

        public static ComponentInfo build(java.util.Map<String, ?> map) throws Exception {
            ComponentInfo self = new ComponentInfo();
            return TeaModel.build(map, self);
        }

        public ComponentInfo setComponentName(String componentName) {
            this.componentName = componentName;
            return this;
        }
        public String getComponentName() {
            return this.componentName;
        }

        public ComponentInfo setComponentType(String componentType) {
            this.componentType = componentType;
            return this;
        }
        public String getComponentType() {
            return this.componentType;
        }

    }

}
