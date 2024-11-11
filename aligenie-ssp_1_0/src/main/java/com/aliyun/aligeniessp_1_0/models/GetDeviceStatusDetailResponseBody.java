// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetDeviceStatusDetailResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>0EC7*726E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetDeviceStatusDetailResponseBodyResult result;

    public static GetDeviceStatusDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceStatusDetailResponseBody self = new GetDeviceStatusDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeviceStatusDetailResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetDeviceStatusDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDeviceStatusDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDeviceStatusDetailResponseBody setResult(GetDeviceStatusDetailResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetDeviceStatusDetailResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetDeviceStatusDetailResponseBodyResultPlayer extends TeaModel {
        @NameInMap("AudioAlbum")
        public String audioAlbum;

        /**
         * <strong>example:</strong>
         * <p>刘德华</p>
         */
        @NameInMap("AudioAnchor")
        public String audioAnchor;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("AudioExt")
        public String audioExt;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("AudioId")
        public String audioId;

        /**
         * <strong>example:</strong>
         * <p>253</p>
         */
        @NameInMap("AudioLength")
        public String audioLength;

        @NameInMap("AudioName")
        public String audioName;

        /**
         * <strong>example:</strong>
         * <p>xiami</p>
         */
        @NameInMap("AudioSource")
        public String audioSource;

        /**
         * <strong>example:</strong>
         * <p><a href="https://xxx">https://xxx</a></p>
         */
        @NameInMap("AudioUrl")
        public String audioUrl;

        /**
         * <strong>example:</strong>
         * <p>mp3</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <strong>example:</strong>
         * <p>cloud</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>pause</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("Timestamp")
        public String timestamp;

        public static GetDeviceStatusDetailResponseBodyResultPlayer build(java.util.Map<String, ?> map) throws Exception {
            GetDeviceStatusDetailResponseBodyResultPlayer self = new GetDeviceStatusDetailResponseBodyResultPlayer();
            return TeaModel.build(map, self);
        }

        public GetDeviceStatusDetailResponseBodyResultPlayer setAudioAlbum(String audioAlbum) {
            this.audioAlbum = audioAlbum;
            return this;
        }
        public String getAudioAlbum() {
            return this.audioAlbum;
        }

        public GetDeviceStatusDetailResponseBodyResultPlayer setAudioAnchor(String audioAnchor) {
            this.audioAnchor = audioAnchor;
            return this;
        }
        public String getAudioAnchor() {
            return this.audioAnchor;
        }

        public GetDeviceStatusDetailResponseBodyResultPlayer setAudioExt(String audioExt) {
            this.audioExt = audioExt;
            return this;
        }
        public String getAudioExt() {
            return this.audioExt;
        }

        public GetDeviceStatusDetailResponseBodyResultPlayer setAudioId(String audioId) {
            this.audioId = audioId;
            return this;
        }
        public String getAudioId() {
            return this.audioId;
        }

        public GetDeviceStatusDetailResponseBodyResultPlayer setAudioLength(String audioLength) {
            this.audioLength = audioLength;
            return this;
        }
        public String getAudioLength() {
            return this.audioLength;
        }

        public GetDeviceStatusDetailResponseBodyResultPlayer setAudioName(String audioName) {
            this.audioName = audioName;
            return this;
        }
        public String getAudioName() {
            return this.audioName;
        }

        public GetDeviceStatusDetailResponseBodyResultPlayer setAudioSource(String audioSource) {
            this.audioSource = audioSource;
            return this;
        }
        public String getAudioSource() {
            return this.audioSource;
        }

        public GetDeviceStatusDetailResponseBodyResultPlayer setAudioUrl(String audioUrl) {
            this.audioUrl = audioUrl;
            return this;
        }
        public String getAudioUrl() {
            return this.audioUrl;
        }

        public GetDeviceStatusDetailResponseBodyResultPlayer setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public GetDeviceStatusDetailResponseBodyResultPlayer setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public GetDeviceStatusDetailResponseBodyResultPlayer setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetDeviceStatusDetailResponseBodyResultPlayer setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDeviceStatusDetailResponseBodyResultPlayer setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

    }

    public static class GetDeviceStatusDetailResponseBodyResultPower extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Quantity")
        public Integer quantity;

        @NameInMap("Status")
        public String status;

        public static GetDeviceStatusDetailResponseBodyResultPower build(java.util.Map<String, ?> map) throws Exception {
            GetDeviceStatusDetailResponseBodyResultPower self = new GetDeviceStatusDetailResponseBodyResultPower();
            return TeaModel.build(map, self);
        }

        public GetDeviceStatusDetailResponseBodyResultPower setQuantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }
        public Integer getQuantity() {
            return this.quantity;
        }

        public GetDeviceStatusDetailResponseBodyResultPower setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetDeviceStatusDetailResponseBodyResultSpeaker extends TeaModel {
        @NameInMap("Muted")
        public Boolean muted;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Volume")
        public Integer volume;

        public static GetDeviceStatusDetailResponseBodyResultSpeaker build(java.util.Map<String, ?> map) throws Exception {
            GetDeviceStatusDetailResponseBodyResultSpeaker self = new GetDeviceStatusDetailResponseBodyResultSpeaker();
            return TeaModel.build(map, self);
        }

        public GetDeviceStatusDetailResponseBodyResultSpeaker setMuted(Boolean muted) {
            this.muted = muted;
            return this;
        }
        public Boolean getMuted() {
            return this.muted;
        }

        public GetDeviceStatusDetailResponseBodyResultSpeaker setVolume(Integer volume) {
            this.volume = volume;
            return this;
        }
        public Integer getVolume() {
            return this.volume;
        }

    }

    public static class GetDeviceStatusDetailResponseBodyResult extends TeaModel {
        @NameInMap("Player")
        public GetDeviceStatusDetailResponseBodyResultPlayer player;

        @NameInMap("Power")
        public GetDeviceStatusDetailResponseBodyResultPower power;

        @NameInMap("Speaker")
        public GetDeviceStatusDetailResponseBodyResultSpeaker speaker;

        public static GetDeviceStatusDetailResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetDeviceStatusDetailResponseBodyResult self = new GetDeviceStatusDetailResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetDeviceStatusDetailResponseBodyResult setPlayer(GetDeviceStatusDetailResponseBodyResultPlayer player) {
            this.player = player;
            return this;
        }
        public GetDeviceStatusDetailResponseBodyResultPlayer getPlayer() {
            return this.player;
        }

        public GetDeviceStatusDetailResponseBodyResult setPower(GetDeviceStatusDetailResponseBodyResultPower power) {
            this.power = power;
            return this;
        }
        public GetDeviceStatusDetailResponseBodyResultPower getPower() {
            return this.power;
        }

        public GetDeviceStatusDetailResponseBodyResult setSpeaker(GetDeviceStatusDetailResponseBodyResultSpeaker speaker) {
            this.speaker = speaker;
            return this;
        }
        public GetDeviceStatusDetailResponseBodyResultSpeaker getSpeaker() {
            return this.speaker;
        }

    }

}
