// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ViewOncallScheduleResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8FDE2569-626B-5176-9844-28877A*****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The on-call calendar. The key is the shift name, and the value is a list of on-call shifts for the shift within the queried date range.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;testName&quot;:[{&quot;contactId&quot;:&quot;testId&quot;,&quot;contactName&quot;:&quot;Zhang San&quot;,&quot;start&quot;:&quot;2024-10-10 09:00&quot;,&quot;end&quot;:&quot;2024-10-15 18:00&quot;}]}</p>
     */
    @NameInMap("schedule")
    public java.util.Map<String, java.util.List<ScheduleValue>> schedule;

    public static ViewOncallScheduleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ViewOncallScheduleResponseBody self = new ViewOncallScheduleResponseBody();
        return TeaModel.build(map, self);
    }

    public ViewOncallScheduleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ViewOncallScheduleResponseBody setSchedule(java.util.Map<String, java.util.List<ScheduleValue>> schedule) {
        this.schedule = schedule;
        return this;
    }
    public java.util.Map<String, java.util.List<ScheduleValue>> getSchedule() {
        return this.schedule;
    }

}
