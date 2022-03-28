// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class UpdateRecordingStorageSettingsRequest extends TeaModel {
    @NameInMap("RecordingStorageSettingList")
    public String recordingStorageSettingList;

    public static UpdateRecordingStorageSettingsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRecordingStorageSettingsRequest self = new UpdateRecordingStorageSettingsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRecordingStorageSettingsRequest setRecordingStorageSettingList(String recordingStorageSettingList) {
        this.recordingStorageSettingList = recordingStorageSettingList;
        return this;
    }
    public String getRecordingStorageSettingList() {
        return this.recordingStorageSettingList;
    }

}
