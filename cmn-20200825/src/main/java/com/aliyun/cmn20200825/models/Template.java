// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class Template extends TeaModel {
    // 模板类型
    @NameInMap("Category")
    public String category;

    // 模板说明
    @NameInMap("Comment")
    public String comment;

    // 创建时间
    @NameInMap("GmtCreate")
    public String gmtCreate;

    // 修改时间
    @NameInMap("GmtModify")
    public String gmtModify;

    // 模板入参
    @NameInMap("Input")
    public java.util.List<TemplateInput> input;

    // 模板出参
    @NameInMap("Output")
    public java.util.List<TemplateOutput> output;

    // 模板名称
    @NameInMap("TemplateName")
    public String templateName;

    // 模板类型
    @NameInMap("TemplateType")
    public String templateType;

    public static Template build(java.util.Map<String, ?> map) throws Exception {
        Template self = new Template();
        return TeaModel.build(map, self);
    }

    public Template setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public Template setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public Template setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public Template setGmtModify(String gmtModify) {
        this.gmtModify = gmtModify;
        return this;
    }
    public String getGmtModify() {
        return this.gmtModify;
    }

    public Template setInput(java.util.List<TemplateInput> input) {
        this.input = input;
        return this;
    }
    public java.util.List<TemplateInput> getInput() {
        return this.input;
    }

    public Template setOutput(java.util.List<TemplateOutput> output) {
        this.output = output;
        return this;
    }
    public java.util.List<TemplateOutput> getOutput() {
        return this.output;
    }

    public Template setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public Template setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

    public static class TemplateInput extends TeaModel {
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

        public static TemplateInput build(java.util.Map<String, ?> map) throws Exception {
            TemplateInput self = new TemplateInput();
            return TeaModel.build(map, self);
        }

        public TemplateInput setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public TemplateInput setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public TemplateInput setSample(String sample) {
            this.sample = sample;
            return this;
        }
        public String getSample() {
            return this.sample;
        }

        public TemplateInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class TemplateOutput extends TeaModel {
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

        public static TemplateOutput build(java.util.Map<String, ?> map) throws Exception {
            TemplateOutput self = new TemplateOutput();
            return TeaModel.build(map, self);
        }

        public TemplateOutput setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public TemplateOutput setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public TemplateOutput setSample(String sample) {
            this.sample = sample;
            return this;
        }
        public String getSample() {
            return this.sample;
        }

        public TemplateOutput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
