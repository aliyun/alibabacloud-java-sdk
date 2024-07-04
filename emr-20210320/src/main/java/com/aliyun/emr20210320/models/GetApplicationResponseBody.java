// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class GetApplicationResponseBody extends TeaModel {
    @NameInMap("Application")
    public Application application;

    /**
     * <p>请求ID。</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationResponseBody self = new GetApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetApplicationResponseBody setApplication(Application application) {
        this.application = application;
        return this;
    }
    public Application getApplication() {
        return this.application;
    }

    public GetApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ValueAttribute extends TeaModel {
        /**
         * <p>值表述。</p>
         * 
         * <strong>example:</strong>
         * <p>描述</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>值步长。</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ValueIncrementStep")
        public String valueIncrementStep;

        /**
         * <p>最大值。</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("ValueMaximum")
        public String valueMaximum;

        /**
         * <p>最小值。</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ValueMinimum")
        public String valueMinimum;

        /**
         * <p>属性值类型。</p>
         * 
         * <strong>example:</strong>
         * <p>STRING</p>
         */
        @NameInMap("ValueType")
        public String valueType;

        /**
         * <p>值单位。</p>
         * 
         * <strong>example:</strong>
         * <p>number</p>
         */
        @NameInMap("ValueUnit")
        public String valueUnit;

        public static ValueAttribute build(java.util.Map<String, ?> map) throws Exception {
            ValueAttribute self = new ValueAttribute();
            return TeaModel.build(map, self);
        }

        public ValueAttribute setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ValueAttribute setValueIncrementStep(String valueIncrementStep) {
            this.valueIncrementStep = valueIncrementStep;
            return this;
        }
        public String getValueIncrementStep() {
            return this.valueIncrementStep;
        }

        public ValueAttribute setValueMaximum(String valueMaximum) {
            this.valueMaximum = valueMaximum;
            return this;
        }
        public String getValueMaximum() {
            return this.valueMaximum;
        }

        public ValueAttribute setValueMinimum(String valueMinimum) {
            this.valueMinimum = valueMinimum;
            return this;
        }
        public String getValueMinimum() {
            return this.valueMinimum;
        }

        public ValueAttribute setValueType(String valueType) {
            this.valueType = valueType;
            return this;
        }
        public String getValueType() {
            return this.valueType;
        }

        public ValueAttribute setValueUnit(String valueUnit) {
            this.valueUnit = valueUnit;
            return this;
        }
        public String getValueUnit() {
            return this.valueUnit;
        }

    }

    public static class ActionParams extends TeaModel {
        /**
         * <p>动作参数描述。</p>
         * 
         * <strong>example:</strong>
         * <p>start</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>动作参数KEY。</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>动作参数属性。</p>
         */
        @NameInMap("ValueAttribute")
        public ValueAttribute valueAttribute;

        public static ActionParams build(java.util.Map<String, ?> map) throws Exception {
            ActionParams self = new ActionParams();
            return TeaModel.build(map, self);
        }

        public ActionParams setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ActionParams setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ActionParams setValueAttribute(ValueAttribute valueAttribute) {
            this.valueAttribute = valueAttribute;
            return this;
        }
        public ValueAttribute getValueAttribute() {
            return this.valueAttribute;
        }

    }

    public static class Actions extends TeaModel {
        /**
         * <p>操作名称。</p>
         * 
         * <strong>example:</strong>
         * <p>START</p>
         */
        @NameInMap("ActionName")
        public String actionName;

        /**
         * <p>操作参数。</p>
         */
        @NameInMap("ActionParams")
        public java.util.List<ActionParams> actionParams;

        /**
         * <p>命令。</p>
         * 
         * <strong>example:</strong>
         * <p>START</p>
         */
        @NameInMap("Command")
        public String command;

        /**
         * <p>组件名称。</p>
         * 
         * <strong>example:</strong>
         * <p>DataNode</p>
         */
        @NameInMap("ComponentName")
        public String componentName;

        /**
         * <p>操作描述。</p>
         * 
         * <strong>example:</strong>
         * <p>描述</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>执行范围。</p>
         * 
         * <strong>example:</strong>
         * <p>CLUSTER</p>
         */
        @NameInMap("RunActionScope")
        public String runActionScope;

        public static Actions build(java.util.Map<String, ?> map) throws Exception {
            Actions self = new Actions();
            return TeaModel.build(map, self);
        }

        public Actions setActionName(String actionName) {
            this.actionName = actionName;
            return this;
        }
        public String getActionName() {
            return this.actionName;
        }

        public Actions setActionParams(java.util.List<ActionParams> actionParams) {
            this.actionParams = actionParams;
            return this;
        }
        public java.util.List<ActionParams> getActionParams() {
            return this.actionParams;
        }

        public Actions setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

        public Actions setComponentName(String componentName) {
            this.componentName = componentName;
            return this;
        }
        public String getComponentName() {
            return this.componentName;
        }

        public Actions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public Actions setRunActionScope(String runActionScope) {
            this.runActionScope = runActionScope;
            return this;
        }
        public String getRunActionScope() {
            return this.runActionScope;
        }

    }

    public static class Application extends TeaModel {
        /**
         * <p>操作列表。</p>
         */
        @NameInMap("Actions")
        public java.util.List<Actions> actions;

        /**
         * <p>应用名称。</p>
         * 
         * <strong>example:</strong>
         * <p>HDFS</p>
         */
        @NameInMap("ApplicationName")
        public String applicationName;

        /**
         * <p>应用操作状态。</p>
         */
        @NameInMap("ApplicationState")
        public String applicationState;

        /**
         * <p>应用版本。</p>
         * 
         * <strong>example:</strong>
         * <p>2.8.5</p>
         */
        @NameInMap("ApplicationVersion")
        public String applicationVersion;

        /**
         * <p>社区版本。</p>
         * 
         * <strong>example:</strong>
         * <p>2.8.5</p>
         */
        @NameInMap("CommunityVersion")
        public String communityVersion;

        public static Application build(java.util.Map<String, ?> map) throws Exception {
            Application self = new Application();
            return TeaModel.build(map, self);
        }

        public Application setActions(java.util.List<Actions> actions) {
            this.actions = actions;
            return this;
        }
        public java.util.List<Actions> getActions() {
            return this.actions;
        }

        public Application setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
        }

        public Application setApplicationState(String applicationState) {
            this.applicationState = applicationState;
            return this;
        }
        public String getApplicationState() {
            return this.applicationState;
        }

        public Application setApplicationVersion(String applicationVersion) {
            this.applicationVersion = applicationVersion;
            return this;
        }
        public String getApplicationVersion() {
            return this.applicationVersion;
        }

        public Application setCommunityVersion(String communityVersion) {
            this.communityVersion = communityVersion;
            return this;
        }
        public String getCommunityVersion() {
            return this.communityVersion;
        }

    }

}
