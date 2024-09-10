// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class CreateAppRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TestApp</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <strong>example:</strong>
     * <p>App</p>
     */
    @NameInMap("AppType")
    public String appType;

    /**
     * <strong>example:</strong>
     * <p>TestToken</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Configs")
    public java.util.List<CreateAppRequestConfigs> configs;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>import &quot;./task/echo.wdl&quot; as echo workflow wf_echo {   call echo.echo }</p>
     */
    @NameInMap("Definition")
    public String definition;

    @NameInMap("Dependencies")
    public java.util.List<CreateAppRequestDependencies> dependencies;

    /**
     * <strong>example:</strong>
     * <p>This is a test app</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>Example documentation content</p>
     */
    @NameInMap("Documentation")
    public String documentation;

    /**
     * <strong>example:</strong>
     * <p>{&quot;key&quot;:&quot;value&quot;}</p>
     */
    @NameInMap("Labels")
    public String labels;

    /**
     * <strong>example:</strong>
     * <p>WDL</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("LanguageVersion")
    public String languageVersion;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>main.wdl</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <strong>example:</strong>
     * <p>Example revision comment</p>
     */
    @NameInMap("RevisionComment")
    public String revisionComment;

    /**
     * <strong>example:</strong>
     * <p>ProduceVersion</p>
     */
    @NameInMap("RevisionTag")
    public String revisionTag;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TestWorkspace</p>
     */
    @NameInMap("Workspace")
    public String workspace;

    public static CreateAppRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppRequest self = new CreateAppRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateAppRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public CreateAppRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateAppRequest setConfigs(java.util.List<CreateAppRequestConfigs> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.List<CreateAppRequestConfigs> getConfigs() {
        return this.configs;
    }

    public CreateAppRequest setDefinition(String definition) {
        this.definition = definition;
        return this;
    }
    public String getDefinition() {
        return this.definition;
    }

    public CreateAppRequest setDependencies(java.util.List<CreateAppRequestDependencies> dependencies) {
        this.dependencies = dependencies;
        return this;
    }
    public java.util.List<CreateAppRequestDependencies> getDependencies() {
        return this.dependencies;
    }

    public CreateAppRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAppRequest setDocumentation(String documentation) {
        this.documentation = documentation;
        return this;
    }
    public String getDocumentation() {
        return this.documentation;
    }

    public CreateAppRequest setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

    public CreateAppRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public CreateAppRequest setLanguageVersion(String languageVersion) {
        this.languageVersion = languageVersion;
        return this;
    }
    public String getLanguageVersion() {
        return this.languageVersion;
    }

    public CreateAppRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public CreateAppRequest setRevisionComment(String revisionComment) {
        this.revisionComment = revisionComment;
        return this;
    }
    public String getRevisionComment() {
        return this.revisionComment;
    }

    public CreateAppRequest setRevisionTag(String revisionTag) {
        this.revisionTag = revisionTag;
        return this;
    }
    public String getRevisionTag() {
        return this.revisionTag;
    }

    public CreateAppRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public static class CreateAppRequestConfigs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{     &quot;wgs.apply_bqsr.cpu&quot;: 4,     &quot;wgs.apply_bqsr.disks&quot;: &quot;local-disk 250 cloud_ssd&quot;,     &quot;wgs.apply_bqsr.gatk_Launcher&quot;: &quot;/usr/local/bin/gatk-4.1.4.1/gatk&quot;,     &quot;wgs.apply_bqsr.java_opts&quot;: &quot;\&quot;-XX:GCTimeLimit=50 -XX:GCHeapFreeLimit=10 -Xms3000m -Djava.io.tmpdir=/mnt\&quot;&quot;,     &quot;wgs.apply_bqsr.memory&quot;: &quot;8G&quot;}</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>./config/example.json</p>
         */
        @NameInMap("Path")
        public String path;

        public static CreateAppRequestConfigs build(java.util.Map<String, ?> map) throws Exception {
            CreateAppRequestConfigs self = new CreateAppRequestConfigs();
            return TeaModel.build(map, self);
        }

        public CreateAppRequestConfigs setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateAppRequestConfigs setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class CreateAppRequestDependencies extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>task echo {   String txt_out = &quot;default_txt_out&quot;   String dd_out = &quot;default_dd_out&quot;    command {     echo Hello &gt; ${txt_out}     /bin/bash -c &quot;dd if=/dev/zero of=${dd_out} bs=1M count=15&quot;     echo &quot;This is a test std out.&quot;   }    runtime {     cpu: &quot;2&quot;     memory: &quot;4G&quot;     autoReleaseJob: false     reserveOnFail: true     userData: &quot;key1 value1&quot;     disks: &quot;local-disk 40 cloud_ssd, /home/mount/ 40 cloud_efficiency&quot;     tag: &quot;TestTag&quot;   }    output {     File outTxtFile = &quot;${txt_out}&quot;     File outDdFile = &quot;${dd_out}&quot;   } }</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>./task/echo.wdl</p>
         */
        @NameInMap("Path")
        public String path;

        public static CreateAppRequestDependencies build(java.util.Map<String, ?> map) throws Exception {
            CreateAppRequestDependencies self = new CreateAppRequestDependencies();
            return TeaModel.build(map, self);
        }

        public CreateAppRequestDependencies setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateAppRequestDependencies setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

}
