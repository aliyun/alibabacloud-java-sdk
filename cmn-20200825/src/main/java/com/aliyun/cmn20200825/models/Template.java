// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class Template extends TeaModel {
    @NameInMap("Category")
    public String category;

    @NameInMap("Comment")
    public String comment;

    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("GmtModify")
    public String gmtModify;

    @NameInMap("Input")
    public java.util.List<TemplateInput> input;

    @NameInMap("Output")
    public java.util.List<TemplateOutput> output;

    @NameInMap("TemplateName")
    public String templateName;

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
        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("Sample")
        public String sample;

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
        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("Sample")
        public String sample;

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
