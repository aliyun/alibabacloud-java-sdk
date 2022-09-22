// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeEcsScenarioFacadeRequest extends TeaModel {
    @NameInMap("ExtMap")
    public java.util.Map<String, String> extMap;

    @NameInMap("ExtParam")
    public String extParam;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ScenarioList")
    public java.util.List<ScenarioList> scenarioList;

    public static DescribeEcsScenarioFacadeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEcsScenarioFacadeRequest self = new DescribeEcsScenarioFacadeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEcsScenarioFacadeRequest setExtMap(java.util.Map<String, String> extMap) {
        this.extMap = extMap;
        return this;
    }
    public java.util.Map<String, String> getExtMap() {
        return this.extMap;
    }

    public DescribeEcsScenarioFacadeRequest setExtParam(String extParam) {
        this.extParam = extParam;
        return this;
    }
    public String getExtParam() {
        return this.extParam;
    }

    public DescribeEcsScenarioFacadeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeEcsScenarioFacadeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeEcsScenarioFacadeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeEcsScenarioFacadeRequest setScenarioList(java.util.List<ScenarioList> scenarioList) {
        this.scenarioList = scenarioList;
        return this;
    }
    public java.util.List<ScenarioList> getScenarioList() {
        return this.scenarioList;
    }

    public static class ScenarioResources extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Values")
        public java.util.List<String> values;

        public static ScenarioResources build(java.util.Map<String, ?> map) throws Exception {
            ScenarioResources self = new ScenarioResources();
            return TeaModel.build(map, self);
        }

        public ScenarioResources setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ScenarioResources setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class ScenarioList extends TeaModel {
        @NameInMap("Scenario")
        public String scenario;

        @NameInMap("ScenarioResources")
        public java.util.List<ScenarioResources> scenarioResources;

        public static ScenarioList build(java.util.Map<String, ?> map) throws Exception {
            ScenarioList self = new ScenarioList();
            return TeaModel.build(map, self);
        }

        public ScenarioList setScenario(String scenario) {
            this.scenario = scenario;
            return this;
        }
        public String getScenario() {
            return this.scenario;
        }

        public ScenarioList setScenarioResources(java.util.List<ScenarioResources> scenarioResources) {
            this.scenarioResources = scenarioResources;
            return this;
        }
        public java.util.List<ScenarioResources> getScenarioResources() {
            return this.scenarioResources;
        }

    }

}
