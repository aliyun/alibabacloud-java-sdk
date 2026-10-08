// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class MultilingualContentEntry extends TeaModel {
    /**
     * <p>The multilingual brief description.</p>
     * 
     * <strong>example:</strong>
     * <p>No personnel activity at the office desk</p>
     */
    @NameInMap("Caption")
    public String caption;

    /**
     * <p>The multilingual detailed description.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a close-up shot of an office desk setup. In the left foreground stands a tall, cylindrical, off-white insulated tumbler. A rectangular black mousepad occupies the center of the desk, holding a black backlit mechanical keyboard. Directly behind the keyboard sits a computer monitor with its screen illuminated, displaying the operating system\&quot;s application dock at the bottom. To the front right of the monitor stands a red metal beverage can, surrounded by a tangle of white data cables and a charging adapter. A small, silver, rectangular device (possibly a USB drive or an adapter) rests in the gap behind the left side of the keyboard, and a tiny pink decorative object is faintly visible on the desk surface. The scene is devoid of human activity; all objects remain motionless.</p>
     */
    @NameInMap("Description")
    public String description;

    public static MultilingualContentEntry build(java.util.Map<String, ?> map) throws Exception {
        MultilingualContentEntry self = new MultilingualContentEntry();
        return TeaModel.build(map, self);
    }

    public MultilingualContentEntry setCaption(String caption) {
        this.caption = caption;
        return this;
    }
    public String getCaption() {
        return this.caption;
    }

    public MultilingualContentEntry setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
