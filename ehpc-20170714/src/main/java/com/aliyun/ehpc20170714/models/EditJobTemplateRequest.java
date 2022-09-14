// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20170714.models;

import com.aliyun.tea.*;

public class EditJobTemplateRequest extends TeaModel {
    @NameInMap("ArrayRequest")
    public String arrayRequest;

    @NameInMap("CommandLine")
    public String commandLine;

    @NameInMap("Name")
    public String name;

    @NameInMap("PackagePath")
    public String packagePath;

    @NameInMap("Priority")
    public Integer priority;

    @NameInMap("ReRunable")
    public Boolean reRunable;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RunasUser")
    public String runasUser;

    @NameInMap("StderrRedirectPath")
    public String stderrRedirectPath;

    @NameInMap("StdoutRedirectPath")
    public String stdoutRedirectPath;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("Variables")
    public String variables;

    public static EditJobTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        EditJobTemplateRequest self = new EditJobTemplateRequest();
        return TeaModel.build(map, self);
    }

    public EditJobTemplateRequest setArrayRequest(String arrayRequest) {
        this.arrayRequest = arrayRequest;
        return this;
    }
    public String getArrayRequest() {
        return this.arrayRequest;
    }

    public EditJobTemplateRequest setCommandLine(String commandLine) {
        this.commandLine = commandLine;
        return this;
    }
    public String getCommandLine() {
        return this.commandLine;
    }

    public EditJobTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public EditJobTemplateRequest setPackagePath(String packagePath) {
        this.packagePath = packagePath;
        return this;
    }
    public String getPackagePath() {
        return this.packagePath;
    }

    public EditJobTemplateRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public EditJobTemplateRequest setReRunable(Boolean reRunable) {
        this.reRunable = reRunable;
        return this;
    }
    public Boolean getReRunable() {
        return this.reRunable;
    }

    public EditJobTemplateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public EditJobTemplateRequest setRunasUser(String runasUser) {
        this.runasUser = runasUser;
        return this;
    }
    public String getRunasUser() {
        return this.runasUser;
    }

    public EditJobTemplateRequest setStderrRedirectPath(String stderrRedirectPath) {
        this.stderrRedirectPath = stderrRedirectPath;
        return this;
    }
    public String getStderrRedirectPath() {
        return this.stderrRedirectPath;
    }

    public EditJobTemplateRequest setStdoutRedirectPath(String stdoutRedirectPath) {
        this.stdoutRedirectPath = stdoutRedirectPath;
        return this;
    }
    public String getStdoutRedirectPath() {
        return this.stdoutRedirectPath;
    }

    public EditJobTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public EditJobTemplateRequest setVariables(String variables) {
        this.variables = variables;
        return this;
    }
    public String getVariables() {
        return this.variables;
    }

}
