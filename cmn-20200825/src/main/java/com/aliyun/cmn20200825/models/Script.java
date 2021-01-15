// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class Script extends TeaModel {
    // 脚本代码
    @NameInMap("Content")
    public String content;

    // 创建时间
    @NameInMap("GmtCreate")
    public String gmtCreate;

    // 修改时间
    @NameInMap("GmtModify")
    public String gmtModify;

    // 模板入参
    @NameInMap("Input")
    public java.util.List<ScriptInput> input;

    // 模板出参
    @NameInMap("Output")
    public java.util.List<ScriptOutput> output;

    // 规则列表
    @NameInMap("Rules")
    public java.util.List<ScriptRule> rules;

    // 脚本id
    @NameInMap("ScriptId")
    public String scriptId;

    // 模板id
    @NameInMap("TemplateId")
    public String templateId;

    // 版本id
    @NameInMap("VersionId")
    public String versionId;

    public static Script build(java.util.Map<String, ?> map) throws Exception {
        Script self = new Script();
        return TeaModel.build(map, self);
    }

    public Script setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public Script setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public Script setGmtModify(String gmtModify) {
        this.gmtModify = gmtModify;
        return this;
    }
    public String getGmtModify() {
        return this.gmtModify;
    }

    public Script setInput(java.util.List<ScriptInput> input) {
        this.input = input;
        return this;
    }
    public java.util.List<ScriptInput> getInput() {
        return this.input;
    }

    public Script setOutput(java.util.List<ScriptOutput> output) {
        this.output = output;
        return this;
    }
    public java.util.List<ScriptOutput> getOutput() {
        return this.output;
    }

    public Script setRules(java.util.List<ScriptRule> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<ScriptRule> getRules() {
        return this.rules;
    }

    public Script setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

    public Script setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public Script setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

    public static class ScriptInput extends TeaModel {
        // 参数说明
        @NameInMap("Description")
        public String description;

        // 参数名称
        @NameInMap("Name")
        public String name;

        // 参数示例
        @NameInMap("Sample")
        public String sample;

        // 参数类型
        @NameInMap("Type")
        public String type;

        public static ScriptInput build(java.util.Map<String, ?> map) throws Exception {
            ScriptInput self = new ScriptInput();
            return TeaModel.build(map, self);
        }

        public ScriptInput setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ScriptInput setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ScriptInput setSample(String sample) {
            this.sample = sample;
            return this;
        }
        public String getSample() {
            return this.sample;
        }

        public ScriptInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ScriptOutput extends TeaModel {
        // 参数说明
        @NameInMap("Description")
        public String description;

        // 参数名称
        @NameInMap("Name")
        public String name;

        // 参数示例
        @NameInMap("Sample")
        public String sample;

        // 参数类型
        @NameInMap("Type")
        public String type;

        public static ScriptOutput build(java.util.Map<String, ?> map) throws Exception {
            ScriptOutput self = new ScriptOutput();
            return TeaModel.build(map, self);
        }

        public ScriptOutput setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ScriptOutput setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ScriptOutput setSample(String sample) {
            this.sample = sample;
            return this;
        }
        public String getSample() {
            return this.sample;
        }

        public ScriptOutput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class InspectionScriptInspectionAlarmRules extends TeaModel {
        // 告警表达式
        @NameInMap("AlarmExpression")
        public String alarmExpression;

        // 告警符号
        @NameInMap("AlarmOperator")
        public String alarmOperator;

        // 告警值
        @NameInMap("AlarmValue")
        public String alarmValue;

        // 告警级别
        @NameInMap("AlarmLevel")
        public String alarmLevel;

        public static InspectionScriptInspectionAlarmRules build(java.util.Map<String, ?> map) throws Exception {
            InspectionScriptInspectionAlarmRules self = new InspectionScriptInspectionAlarmRules();
            return TeaModel.build(map, self);
        }

        public InspectionScriptInspectionAlarmRules setAlarmExpression(String alarmExpression) {
            this.alarmExpression = alarmExpression;
            return this;
        }
        public String getAlarmExpression() {
            return this.alarmExpression;
        }

        public InspectionScriptInspectionAlarmRules setAlarmOperator(String alarmOperator) {
            this.alarmOperator = alarmOperator;
            return this;
        }
        public String getAlarmOperator() {
            return this.alarmOperator;
        }

        public InspectionScriptInspectionAlarmRules setAlarmValue(String alarmValue) {
            this.alarmValue = alarmValue;
            return this;
        }
        public String getAlarmValue() {
            return this.alarmValue;
        }

        public InspectionScriptInspectionAlarmRules setAlarmLevel(String alarmLevel) {
            this.alarmLevel = alarmLevel;
            return this;
        }
        public String getAlarmLevel() {
            return this.alarmLevel;
        }

    }

}
