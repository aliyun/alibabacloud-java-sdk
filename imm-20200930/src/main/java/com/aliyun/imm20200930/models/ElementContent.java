// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ElementContent extends TeaModel {
    /**
     * <p>The content of the element.</p>
     * <p>If the value of the Type parameter is image or link, this parameter indicates the placeholder text.</p>
     * 
     * <strong>example:</strong>
     * <p>Text</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The time range. The array length is fixed to 2. One element indicates the start time and the other one indicates the end time. Unit: milliseconds.</p>
     */
    @NameInMap("TimeRange")
    public java.util.List<Long> timeRange;

    /**
     * <p>The type of the element content.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>text</li>
     * <li>image</li>
     * <li>link</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The link to the element content. This parameter takes effect only if the Type parameter is set to image or link.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://aliyun.com">http://aliyun.com</a></p>
     */
    @NameInMap("URL")
    public String URL;

    public static ElementContent build(java.util.Map<String, ?> map) throws Exception {
        ElementContent self = new ElementContent();
        return TeaModel.build(map, self);
    }

    public ElementContent setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ElementContent setTimeRange(java.util.List<Long> timeRange) {
        this.timeRange = timeRange;
        return this;
    }
    public java.util.List<Long> getTimeRange() {
        return this.timeRange;
    }

    public ElementContent setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ElementContent setURL(String URL) {
        this.URL = URL;
        return this;
    }
    public String getURL() {
        return this.URL;
    }

}
