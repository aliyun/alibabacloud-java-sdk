// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetServiceTaskRequest extends TeaModel {
    /**
     * <p>The task type. This parameter is required. Valid values:</p>
     * <ul>
     * <li>heapdump: heap dump.</li>
     * <li>LiveDebug Probe: live_debug_log_probe, live_debug_snapshot_probe, live_debug_metric_probe, live_debug_span_probe, live_debug_span_tag_probe.</li>
     * <li>LiveDebug Command: live_debug_inspect_object, live_debug_search_type, live_debug_search_method, live_debug_decompile, live_debug_get_thread_info, live_debug_get_runtime_info, live_debug_get_memory_info, live_debug_evaluate_expression, live_debug_modify_logger_level.</li>
     * <li>LiveDebug code hot replacement: live_debug_code_replace.</li>
     * </ul>
     * <p>The value must be the same as the type specified during task creation.</p>
     * 
     * <strong>example:</strong>
     * <p>live_debug_log_probe</p>
     */
    @NameInMap("type")
    public String type;

    public static GetServiceTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServiceTaskRequest self = new GetServiceTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetServiceTaskRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
