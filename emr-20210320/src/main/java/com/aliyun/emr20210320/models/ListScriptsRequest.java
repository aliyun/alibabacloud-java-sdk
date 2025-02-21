// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListScriptsRequest extends TeaModel {
    /**
     * <p>Cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-b933c5aac8fe****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The maximum number of records to retrieve at once.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Marks the current position to start reading from.</p>
     * 
     * <strong>example:</strong>
     * <p>dd6b1b2a-5837-5237-abe4-ff0c89568980</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The script ID. Only common scripts are supported.</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    /**
     * <p>The name of the script. Only common scripts are supported. Fuzzy search is supported.</p>
     */
    @NameInMap("ScriptName")
    public String scriptName;

    /**
     * <p>Type of cluster script. Possible values:</p>
     * <ul>
     * <li>BOOTSTRAP: Bootstrap script.</li>
     * <li>NORMAL: Regular cluster script.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>BOOTSTRAP</p>
     */
    @NameInMap("ScriptType")
    public String scriptType;

    /**
     * <p>The status of the script. Only common scripts are supported.</p>
     */
    @NameInMap("Statuses")
    public java.util.List<String> statuses;

    public static ListScriptsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListScriptsRequest self = new ListScriptsRequest();
        return TeaModel.build(map, self);
    }

    public ListScriptsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListScriptsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListScriptsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListScriptsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListScriptsRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

    public ListScriptsRequest setScriptName(String scriptName) {
        this.scriptName = scriptName;
        return this;
    }
    public String getScriptName() {
        return this.scriptName;
    }

    public ListScriptsRequest setScriptType(String scriptType) {
        this.scriptType = scriptType;
        return this;
    }
    public String getScriptType() {
        return this.scriptType;
    }

    public ListScriptsRequest setStatuses(java.util.List<String> statuses) {
        this.statuses = statuses;
        return this;
    }
    public java.util.List<String> getStatuses() {
        return this.statuses;
    }

}
