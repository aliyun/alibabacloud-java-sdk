// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class GetDoctorComputeSummaryRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-b933c5aac8fe****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The resource information, which is used to filter the results.</p>
     */
    @NameInMap("ComponentInfo")
    public ComponentInfo componentInfo;

    /**
     * <p>Specify the date in the ISO 8601 standard. For example, 2023-01-01 represents January 1, 2023.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-01-01</p>
     */
    @NameInMap("DateTime")
    public String dateTime;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
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
        /**
         * <p>Set the filter condition name based on the value of ComponentType. For example, if you set ComponentType to queue, you can specify a specific queue name to obtain the resource usage of a specific queue.</p>
         * 
         * <strong>example:</strong>
         * <p>MAPREDUCE</p>
         */
        @NameInMap("ComponentName")
        public String componentName;

        /**
         * <p>The resource type for filtering. Valid values:</p>
         * <ul>
         * <li>engine: filters results by engine.</li>
         * <li>queue: filters results by queue.</li>
         * <li>cluster: displays the results at the cluster level.</li>
         * </ul>
         * <p>If you do not specify this parameter, the information at the cluster level is displayed by default.</p>
         * 
         * <strong>example:</strong>
         * <p>engine</p>
         */
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
