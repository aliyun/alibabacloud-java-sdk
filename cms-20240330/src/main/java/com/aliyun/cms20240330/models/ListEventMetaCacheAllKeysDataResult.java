// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListEventMetaCacheAllKeysDataResult extends TeaModel {
    /**
     * <p>annotation类型的Key列表</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;message&quot;,&quot;current_value&quot;]</p>
     */
    @NameInMap("annotation")
    public java.util.List<String> annotation;

    /**
     * <p>label类型的Key列表</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;_cms_rule_id&quot;,&quot;_cms_rule_name&quot;]</p>
     */
    @NameInMap("label")
    public java.util.List<String> label;

    /**
     * <p>resource.tag类型的Key列表</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;arn&quot;,&quot;callType&quot;]</p>
     */
    @NameInMap("resourceTag")
    public java.util.List<String> resourceTag;

    public static ListEventMetaCacheAllKeysDataResult build(java.util.Map<String, ?> map) throws Exception {
        ListEventMetaCacheAllKeysDataResult self = new ListEventMetaCacheAllKeysDataResult();
        return TeaModel.build(map, self);
    }

    public ListEventMetaCacheAllKeysDataResult setAnnotation(java.util.List<String> annotation) {
        this.annotation = annotation;
        return this;
    }
    public java.util.List<String> getAnnotation() {
        return this.annotation;
    }

    public ListEventMetaCacheAllKeysDataResult setLabel(java.util.List<String> label) {
        this.label = label;
        return this;
    }
    public java.util.List<String> getLabel() {
        return this.label;
    }

    public ListEventMetaCacheAllKeysDataResult setResourceTag(java.util.List<String> resourceTag) {
        this.resourceTag = resourceTag;
        return this;
    }
    public java.util.List<String> getResourceTag() {
        return this.resourceTag;
    }

}
