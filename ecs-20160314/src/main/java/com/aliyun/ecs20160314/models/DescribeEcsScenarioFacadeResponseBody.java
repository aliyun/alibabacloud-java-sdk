// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeEcsScenarioFacadeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Scenarios")
    public java.util.List<Scenarios> scenarios;

    public static DescribeEcsScenarioFacadeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEcsScenarioFacadeResponseBody self = new DescribeEcsScenarioFacadeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEcsScenarioFacadeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEcsScenarioFacadeResponseBody setScenarios(java.util.List<Scenarios> scenarios) {
        this.scenarios = scenarios;
        return this;
    }
    public java.util.List<Scenarios> getScenarios() {
        return this.scenarios;
    }

    public static class EcsScenarioContentData extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Values")
        public java.util.List<String> values;

        public static EcsScenarioContentData build(java.util.Map<String, ?> map) throws Exception {
            EcsScenarioContentData self = new EcsScenarioContentData();
            return TeaModel.build(map, self);
        }

        public EcsScenarioContentData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public EcsScenarioContentData setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class Contents extends TeaModel {
        @NameInMap("Action")
        public java.util.Map<String, String> action;

        @NameInMap("Attributes")
        public java.util.Map<String, String> attributes;

        @NameInMap("ColorLevel")
        public String colorLevel;

        @NameInMap("Description")
        public String description;

        @NameInMap("EcsScenarioContentData")
        public java.util.List<EcsScenarioContentData> ecsScenarioContentData;

        @NameInMap("Icon")
        public String icon;

        @NameInMap("SupportCancel")
        public String supportCancel;

        @NameInMap("Tips")
        public String tips;

        @NameInMap("Title")
        public String title;

        @NameInMap("Track")
        public java.util.Map<String, String> track;

        public static Contents build(java.util.Map<String, ?> map) throws Exception {
            Contents self = new Contents();
            return TeaModel.build(map, self);
        }

        public Contents setAction(java.util.Map<String, String> action) {
            this.action = action;
            return this;
        }
        public java.util.Map<String, String> getAction() {
            return this.action;
        }

        public Contents setAttributes(java.util.Map<String, String> attributes) {
            this.attributes = attributes;
            return this;
        }
        public java.util.Map<String, String> getAttributes() {
            return this.attributes;
        }

        public Contents setColorLevel(String colorLevel) {
            this.colorLevel = colorLevel;
            return this;
        }
        public String getColorLevel() {
            return this.colorLevel;
        }

        public Contents setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public Contents setEcsScenarioContentData(java.util.List<EcsScenarioContentData> ecsScenarioContentData) {
            this.ecsScenarioContentData = ecsScenarioContentData;
            return this;
        }
        public java.util.List<EcsScenarioContentData> getEcsScenarioContentData() {
            return this.ecsScenarioContentData;
        }

        public Contents setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public Contents setSupportCancel(String supportCancel) {
            this.supportCancel = supportCancel;
            return this;
        }
        public String getSupportCancel() {
            return this.supportCancel;
        }

        public Contents setTips(String tips) {
            this.tips = tips;
            return this;
        }
        public String getTips() {
            return this.tips;
        }

        public Contents setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public Contents setTrack(java.util.Map<String, String> track) {
            this.track = track;
            return this;
        }
        public java.util.Map<String, String> getTrack() {
            return this.track;
        }

    }

    public static class Scenarios extends TeaModel {
        @NameInMap("Contents")
        public java.util.List<Contents> contents;

        @NameInMap("Scenario")
        public String scenario;

        public static Scenarios build(java.util.Map<String, ?> map) throws Exception {
            Scenarios self = new Scenarios();
            return TeaModel.build(map, self);
        }

        public Scenarios setContents(java.util.List<Contents> contents) {
            this.contents = contents;
            return this;
        }
        public java.util.List<Contents> getContents() {
            return this.contents;
        }

        public Scenarios setScenario(String scenario) {
            this.scenario = scenario;
            return this;
        }
        public String getScenario() {
            return this.scenario;
        }

    }

}
