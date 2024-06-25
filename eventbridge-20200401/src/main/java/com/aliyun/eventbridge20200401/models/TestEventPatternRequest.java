// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class TestEventPatternRequest extends TeaModel {
    /**
     * <p>The event.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;datacontenttype&quot;: &quot;application/json;charset=utf-8&quot;,
     *     &quot;aliyunaccountid&quot;: &quot;<em><strong><strong>&quot;,
     *     &quot;aliyunpublishtime&quot;: &quot;2023-04-</strong></strong>:54:57.939Z&quot;,
     *     &quot;data&quot;: {
     *         &quot;resourceEventType&quot;: &quot;<strong><strong>&quot;,
     *         &quot;resourceCreateTime&quot;: &quot;</strong></strong>&quot;,
     *         &quot;resourceId&quot;: &quot;sls-code-***-debug&quot;,
     *         &quot;captureTime&quot;: &quot;**</em>&quot;
     *     },
     *     &quot;aliyunoriginalaccountid&quot;: &quot;<strong><strong>&quot;,
     *     &quot;specversion&quot;: &quot;1.0&quot;,
     *     &quot;aliyuneventbusname&quot;: &quot;</strong></strong>&quot;,
     *     &quot;id&quot;: &quot;295e6bd2-bb72-4f70-<em><em><strong>-204a0680ee41&quot;,
     *     &quot;source&quot;: &quot;acs.sls&quot;,
     *     &quot;time&quot;: &quot;2023-04-</strong></em>:37:56Z&quot;,
     *     &quot;aliyunregionid&quot;: &quot;cn-</em>**&quot;,
     *     &quot;type&quot;: &quot;sls:Config:****&quot;
     * }</p>
     */
    @NameInMap("Event")
    public String event;

    /**
     * <p>The event pattern.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;key1&quot;: &quot;value1&quot;}</p>
     */
    @NameInMap("EventPattern")
    public String eventPattern;

    public static TestEventPatternRequest build(java.util.Map<String, ?> map) throws Exception {
        TestEventPatternRequest self = new TestEventPatternRequest();
        return TeaModel.build(map, self);
    }

    public TestEventPatternRequest setEvent(String event) {
        this.event = event;
        return this;
    }
    public String getEvent() {
        return this.event;
    }

    public TestEventPatternRequest setEventPattern(String eventPattern) {
        this.eventPattern = eventPattern;
        return this;
    }
    public String getEventPattern() {
        return this.eventPattern;
    }

}
