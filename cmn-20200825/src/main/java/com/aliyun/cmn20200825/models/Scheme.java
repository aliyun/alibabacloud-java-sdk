// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class Scheme extends TeaModel {
    @NameInMap("Category")
    public String category;

    @NameInMap("Content")
    public String content;

    @NameInMap("Description")
    public String description;

    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("GmtModify")
    public String gmtModify;

    @NameInMap("Input")
    public java.util.List<SchemeInput> input;

    @NameInMap("Output")
    public java.util.List<SchemeOutput> output;

    @NameInMap("SchemeId")
    public String schemeId;

    @NameInMap("SchemeName")
    public String schemeName;

    @NameInMap("Status")
    public String status;

    @NameInMap("View")
    public String view;

    public static Scheme build(java.util.Map<String, ?> map) throws Exception {
        Scheme self = new Scheme();
        return TeaModel.build(map, self);
    }

    public Scheme setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public Scheme setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public Scheme setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Scheme setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public Scheme setGmtModify(String gmtModify) {
        this.gmtModify = gmtModify;
        return this;
    }
    public String getGmtModify() {
        return this.gmtModify;
    }

    public Scheme setInput(java.util.List<SchemeInput> input) {
        this.input = input;
        return this;
    }
    public java.util.List<SchemeInput> getInput() {
        return this.input;
    }

    public Scheme setOutput(java.util.List<SchemeOutput> output) {
        this.output = output;
        return this;
    }
    public java.util.List<SchemeOutput> getOutput() {
        return this.output;
    }

    public Scheme setSchemeId(String schemeId) {
        this.schemeId = schemeId;
        return this;
    }
    public String getSchemeId() {
        return this.schemeId;
    }

    public Scheme setSchemeName(String schemeName) {
        this.schemeName = schemeName;
        return this;
    }
    public String getSchemeName() {
        return this.schemeName;
    }

    public Scheme setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public Scheme setView(String view) {
        this.view = view;
        return this;
    }
    public String getView() {
        return this.view;
    }

    public static class SchemeInput extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("Sample")
        public String sample;

        @NameInMap("Type")
        public String type;

        public static SchemeInput build(java.util.Map<String, ?> map) throws Exception {
            SchemeInput self = new SchemeInput();
            return TeaModel.build(map, self);
        }

        public SchemeInput setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public SchemeInput setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SchemeInput setSample(String sample) {
            this.sample = sample;
            return this;
        }
        public String getSample() {
            return this.sample;
        }

        public SchemeInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SchemeOutput extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("Sample")
        public String sample;

        @NameInMap("Type")
        public String type;

        public static SchemeOutput build(java.util.Map<String, ?> map) throws Exception {
            SchemeOutput self = new SchemeOutput();
            return TeaModel.build(map, self);
        }

        public SchemeOutput setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public SchemeOutput setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SchemeOutput setSample(String sample) {
            this.sample = sample;
            return this;
        }
        public String getSample() {
            return this.sample;
        }

        public SchemeOutput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
