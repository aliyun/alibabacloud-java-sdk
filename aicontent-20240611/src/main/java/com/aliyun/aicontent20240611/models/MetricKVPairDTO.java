// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class MetricKVPairDTO extends TeaModel {
    /**
     * <p>Metric Name.  </p>
     * <p><strong>Chat</strong>  </p>
     * <ul>
     * <li><code>total_calls</code>: Number Of Calls, integer, Count  </li>
     * <li><code>input_tokens</code>: Total input tokens, integer  </li>
     * <li><code>output_tokens</code>: Total output tokens, integer  </li>
     * <li><code>reasoning_tokens</code>: Reasoning tokens, integer  </li>
     * <li><code>cached_tokens</code>: Cached input tokens (hit), integer</li>
     * </ul>
     * <p><strong>Vision</strong>  </p>
     * <ul>
     * <li><code>total_calls</code>: Number Of Calls, integer, Count  </li>
     * <li><code>image_count</code>: Number of generated images, integer  </li>
     * <li><code>video_duration</code>: Generated video duration, rounded to 3 decimal places, seconds</li>
     * </ul>
     * <p><strong>Embedding</strong>  </p>
     * <ul>
     * <li><code>total_calls</code>: Number Of Calls, integer, Count  </li>
     * <li><code>embedding_output_tokens</code>: Embedding output tokens, integer  </li>
     * <li><code>billing_tokens</code>: Total billing tokens, integer  </li>
     * <li><code>image_tokens</code>: Image tokens (multimodal embedding), integer</li>
     * </ul>
     * <p><strong>Omni-modal (ChatFullmodal / ChatMultimodal)</strong>  </p>
     * <ul>
     * <li><code>total_calls</code>: Number Of Calls, integer, Count  </li>
     * <li><code>input_text_tokens</code>: Input text tokens, integer  </li>
     * <li><code>input_audio_tokens</code>: Input audio tokens, integer  </li>
     * <li><code>input_image_tokens</code>: Input image tokens, integer  </li>
     * <li><code>input_video_tokens</code>: Input video tokens, integer  </li>
     * <li><code>output_text_tokens</code>: Output text tokens, integer  </li>
     * <li><code>output_audio_tokens</code>: Output audio tokens, integer</li>
     * </ul>
     * <p><strong>Speech (TTS / ASR)</strong>  </p>
     * <ul>
     * <li><code>total_calls</code>: Number Of Calls, integer, Count  </li>
     * <li><code>characters</code>: Characters converted to speech, integer  </li>
     * <li><code>asr_duration</code>: Speech recognition duration, rounded to 3 decimal places, seconds</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>total_calls</p>
     */
    @NameInMap("key")
    public String key;

    /**
     * <p>Metric value</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("value")
    public Float value;

    public static MetricKVPairDTO build(java.util.Map<String, ?> map) throws Exception {
        MetricKVPairDTO self = new MetricKVPairDTO();
        return TeaModel.build(map, self);
    }

    public MetricKVPairDTO setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public MetricKVPairDTO setValue(Float value) {
        this.value = value;
        return this;
    }
    public Float getValue() {
        return this.value;
    }

}
