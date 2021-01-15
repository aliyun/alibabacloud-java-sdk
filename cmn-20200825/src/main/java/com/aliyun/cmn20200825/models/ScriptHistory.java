// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ScriptHistory extends TeaModel {
    // 版本说明
    @NameInMap("Comment")
    public String comment;

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
    public java.util.List<ScriptHistoryInput> input;

    // 模板出参
    @NameInMap("Output")
    public java.util.List<ScriptHistoryOutput> output;

    // 脚本id
    @NameInMap("ScriptId")
    public String scriptId;

    // 版本id
    @NameInMap("VersionId")
    public String versionId;

    public static ScriptHistory build(java.util.Map<String, ?> map) throws Exception {
        ScriptHistory self = new ScriptHistory();
        return TeaModel.build(map, self);
    }

    public ScriptHistory setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public ScriptHistory setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ScriptHistory setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public ScriptHistory setGmtModify(String gmtModify) {
        this.gmtModify = gmtModify;
        return this;
    }
    public String getGmtModify() {
        return this.gmtModify;
    }

    public ScriptHistory setInput(java.util.List<ScriptHistoryInput> input) {
        this.input = input;
        return this;
    }
    public java.util.List<ScriptHistoryInput> getInput() {
        return this.input;
    }

    public ScriptHistory setOutput(java.util.List<ScriptHistoryOutput> output) {
        this.output = output;
        return this;
    }
    public java.util.List<ScriptHistoryOutput> getOutput() {
        return this.output;
    }

    public ScriptHistory setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

    public ScriptHistory setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

    public static class ScriptHistoryInput extends TeaModel {
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

        public static ScriptHistoryInput build(java.util.Map<String, ?> map) throws Exception {
            ScriptHistoryInput self = new ScriptHistoryInput();
            return TeaModel.build(map, self);
        }

        public ScriptHistoryInput setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ScriptHistoryInput setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ScriptHistoryInput setSample(String sample) {
            this.sample = sample;
            return this;
        }
        public String getSample() {
            return this.sample;
        }

        public ScriptHistoryInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ScriptHistoryOutput extends TeaModel {
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

        public static ScriptHistoryOutput build(java.util.Map<String, ?> map) throws Exception {
            ScriptHistoryOutput self = new ScriptHistoryOutput();
            return TeaModel.build(map, self);
        }

        public ScriptHistoryOutput setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ScriptHistoryOutput setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ScriptHistoryOutput setSample(String sample) {
            this.sample = sample;
            return this;
        }
        public String getSample() {
            return this.sample;
        }

        public ScriptHistoryOutput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
