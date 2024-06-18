// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListAScriptsRequest extends TeaModel {
    /**
     * <p>The AScript rule IDs.</p>
     */
    @NameInMap("AScriptIds")
    public java.util.List<String> AScriptIds;

    /**
     * <p>The names of the AScript rules.</p>
     */
    @NameInMap("AScriptNames")
    public java.util.List<String> AScriptNames;

    /**
     * <p>The listener IDs.</p>
     */
    @NameInMap("ListenerIds")
    public java.util.List<String> listenerIds;

    /**
     * <p>The maximum number of entries to return.</p>
     * <p>Valid values: <strong>1</strong> to <strong>100</strong>.</p>
     * <p>Default value: <strong>20</strong>. If you do not specify this parameter, the default value is used.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li>You do not need to specify this parameter for the first request.****</li>
     * <li>You must specify the token that is obtained from the previous query as the value of <strong>NextToken</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListAScriptsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAScriptsRequest self = new ListAScriptsRequest();
        return TeaModel.build(map, self);
    }

    public ListAScriptsRequest setAScriptIds(java.util.List<String> AScriptIds) {
        this.AScriptIds = AScriptIds;
        return this;
    }
    public java.util.List<String> getAScriptIds() {
        return this.AScriptIds;
    }

    public ListAScriptsRequest setAScriptNames(java.util.List<String> AScriptNames) {
        this.AScriptNames = AScriptNames;
        return this;
    }
    public java.util.List<String> getAScriptNames() {
        return this.AScriptNames;
    }

    public ListAScriptsRequest setListenerIds(java.util.List<String> listenerIds) {
        this.listenerIds = listenerIds;
        return this;
    }
    public java.util.List<String> getListenerIds() {
        return this.listenerIds;
    }

    public ListAScriptsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAScriptsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
