// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListServiceTaskRequest extends TeaModel {
    /**
     * <p>The maximum number of entries per page. Valid values: 0 to 100. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. Pass the nextToken value from the previous response as-is. This parameter is not required for the first request. The server returns an encrypted hexadecimal string (internal format: {md5}#{dbId}) with a maximum length of 128 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>d23d8f3f0f0cd1984566b1986c9343122fa0385a05c09694c17fe87709f3eb56d1a7ead56b4a2536</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The search condition. A JSON string with a maximum length of 1024 characters. For heapdump, this can be used to filter by IP address or other conditions. Example for pprof: {&quot;ip&quot;:&quot;10.0.0.1&quot;,&quot;start&quot;:1711843200000,&quot;end&quot;:1711846800000,&quot;profileType&quot;:1}.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ip&quot;:&quot;10.0.0.1&quot;}</p>
     */
    @NameInMap("searchCondition")
    public String searchCondition;

    /**
     * <p>The task type. Valid values: heapdump (heap dump). LiveDebug Probe: live_debug_log_probe, live_debug_snapshot_probe, live_debug_metric_probe, live_debug_span_probe, live_debug_span_tag_probe. LiveDebug Command: live_debug_inspect_object, live_debug_search_type, live_debug_search_method, live_debug_decompile, live_debug_get_thread_info, live_debug_get_runtime_info, live_debug_get_memory_info, live_debug_evaluate_expression, live_debug_modify_logger_level. LiveDebug hot code replacement: live_debug_code_replace. The list operation additionally supports pprof.</p>
     * 
     * <strong>example:</strong>
     * <p>live_debug_log_probe</p>
     */
    @NameInMap("type")
    public String type;

    public static ListServiceTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServiceTaskRequest self = new ListServiceTaskRequest();
        return TeaModel.build(map, self);
    }

    public ListServiceTaskRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListServiceTaskRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServiceTaskRequest setSearchCondition(String searchCondition) {
        this.searchCondition = searchCondition;
        return this;
    }
    public String getSearchCondition() {
        return this.searchCondition;
    }

    public ListServiceTaskRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
